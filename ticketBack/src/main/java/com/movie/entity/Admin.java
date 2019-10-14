package com.movie.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zjx
 * @date 2019/9/5 14:57
 */

/**
 * 后台管理员
 */
@Data
@TableName("tadmin")
public class Admin {
    private String uname;//用户名
    private String pwd;//密码
    private String role;//角色
}
