package com.movie.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author zjx
 * @date 2019/9/5 15:01
 */

/**
 *影片
 */
@Data
@TableName("tmovie")
public class Movie {
    private String mid;//影片ID
    private String mname;//影片名称
    private String length; //片长
    private String area;  //制作地区
    private String type;  //类型
    private String director; //导演
    private String actor; //主演
    private double score; // 评分
    private String state; //影片状态̬
    private String details; //影片简介
    private byte[] cover; //影片封面
    private Date bgdate; //上映时间
}
