package com.movie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjx
 * @date 2019/9/10 10:04
 */
@RestController
public class HomeController {

    @GetMapping({"/login","/"})
    public String login(){
        return "login";
    }
}
