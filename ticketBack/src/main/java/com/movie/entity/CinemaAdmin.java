package com.movie.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zjx
 * @date 2019/9/5 14:58
 */

/**
 * 影院管理员
 */
@Data
@TableName("tcinemaadmin")
public class CinemaAdmin {
    private String uname;//用户名
    private String pwd;//密码
    private String cid;//影院ID
    private String role;//角色
}
