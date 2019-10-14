package com.movie.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zjx
 * @date 2019/9/5 14:58
 */

/**
 * 影院
 */
@Data
@TableName("tcinema")
public class Cinema {
    private String cid;      //影院ID
    private String dno;      //区域编号
    private String cname;    //影院名称
    private String address;  //具体地址
}
