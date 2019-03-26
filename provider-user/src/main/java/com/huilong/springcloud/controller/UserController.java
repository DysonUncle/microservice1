package com.huilong.springcloud.controller;

import com.huilong.springcloud.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){

    return new User(id);
}

}
