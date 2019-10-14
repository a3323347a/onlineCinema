package com.movie.mapper;

import com.movie.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zjx
 * @date 2019/9/7 9:57
 */
@Mapper
public interface AdminMapper {

    Admin findAdminByUserName(@Param("userName") String userName);
}
