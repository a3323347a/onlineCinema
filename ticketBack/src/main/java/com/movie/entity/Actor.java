package com.movie.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zjx
 * @date 2019/9/5 14:56
 */

/**
 * 演员
 */
@Data
@TableName("tactor")
public class Actor {
    private String mid; //影片ID
    private String actorid; //演员编号
    private String aname; //姓名
    private String atoname;  //饰演角色
    private String picurl;//剧中照片
}
