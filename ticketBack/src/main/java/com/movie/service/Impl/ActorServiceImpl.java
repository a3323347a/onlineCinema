package com.movie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.movie.entity.Actor;
import com.movie.mapper.ActorMapper;
import com.movie.service.ActorService;
import org.springframework.stereotype.Service;

/**
 * @author zjx
 * @date 2019/10/12 16:00
 */
@Service
public class ActorServiceImpl extends ServiceImpl<ActorMapper, Actor> implements ActorService {

}
