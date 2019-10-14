package com.movie.service.Impl;

import com.movie.entity.Admin;
import com.movie.mapper.AdminMapper;
import com.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zjx
 * @date 2019/9/6 19:41
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AdminMapper adminMapper;

    public Admin findAdminByUserName(String userName){
        return adminMapper.findAdminByUserName(userName);
    }

}
