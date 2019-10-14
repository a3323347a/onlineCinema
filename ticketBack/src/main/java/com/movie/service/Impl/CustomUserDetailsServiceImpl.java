package com.movie.service.Impl;

import com.movie.entity.Admin;
import com.movie.mapper.AdminMapper;
import com.movie.service.CustomUserDetailsService;
import com.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjx
 * @date 2019/9/7 10:38
 */
@Service
public class CustomUserDetailsServiceImpl implements CustomUserDetailsService {

    @Autowired
    private UserService userService;

    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Admin admin = userService.findAdminByUserName(userName);
        if (admin == null){
            throw new UsernameNotFoundException("异常错误: 管理员信息不存在");
        }
        List<SimpleGrantedAuthority> authorityList = new ArrayList<SimpleGrantedAuthority>();
        //添加用户权限
        authorityList.add(new SimpleGrantedAuthority(admin.getRole()));
        //User是org.springframework.security.core.userdetails下的User
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePwd = passwordEncoder.encode(admin.getPwd().trim());
        return new User(admin.getUname(),encodePwd,authorityList);
    }
}
