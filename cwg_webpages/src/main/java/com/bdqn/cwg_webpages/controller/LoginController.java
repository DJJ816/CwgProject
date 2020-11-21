package com.bdqn.cwg_webpages.controller;

import com.bdqn.cwg_webpages.config.RedisHelp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {
    @Resource
    RedisHelp redisHelp;
    @PostMapping("/login")
    public String login(String username,String password){
        boolean result = redisHelp.set(username, 20000, password);
        if(result){
            return "ok";
        }else {
            return "faild";
        }

    }

}
