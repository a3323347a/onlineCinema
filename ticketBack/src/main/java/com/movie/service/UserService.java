package com.movie.service;

import com.movie.entity.Admin;

/**
 * @author zjx
 * @date 2019/9/6 19:41
 */
public interface UserService {

    Admin findAdminByUserName(String userName);

}
