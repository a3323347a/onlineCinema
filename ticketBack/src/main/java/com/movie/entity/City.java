package com.movie.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zjx
 * @date 2019/9/5 14:59
 */

/**
 * 热点城市
 */
@Data
@TableName("tcity")
public class City implements Serializable {

    private String cno;//编号

    private String cname;//名称

    @TableField(exist = false)
    private List<District> districts;  //热点区
}
