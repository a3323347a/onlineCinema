package com.movie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.movie.entity.Actor;
import com.movie.service.ActorService;
import com.movie.util.PageParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zjx
 * @date 2019/10/11 14:11
 */
@RestController
@RequestMapping("/admin/actor")
public class ActorController {

    @Autowired
    private ActorService actorService;

    /**
     * 分页查询
     */
    @GetMapping("/page")
    public ResponseEntity<IPage<Actor>> page(PageParam<Actor> page){
        IPage<Actor> actorListPage = actorService.page(page,new LambdaQueryWrapper<Actor>());
        return ResponseEntity.ok(actorListPage);
    }

    /**
     * 获取全部演员
     */
    @GetMapping("list")
    public ResponseEntity<List<Actor>> list(Actor actor){
        List<Actor> actors = actorService.list(new LambdaQueryWrapper<Actor>()
                .like(actor.getAname() != null,Actor::getAname,actor.getAname()));
        return ResponseEntity.ok(actors);
    }
}
