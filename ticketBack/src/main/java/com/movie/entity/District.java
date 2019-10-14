package com.movie.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zjx
 * @date 2019/9/5 14:59
 */

/**
 * 区域
 */
@Data
@TableName("tdistrict")
public class District {
    private String dno;//区域编号
    private String cno;//城市编号
    private String dname;//区域名称
}
