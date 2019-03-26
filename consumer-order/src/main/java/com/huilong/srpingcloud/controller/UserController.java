package com.huilong.srpingcloud.controller;

import com.huilong.srpingcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${user.url}")
    private  String url;
    //private String url ="http://localhost:7900/user/";
    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable Long id){
          User user = restTemplate.getForObject(url+id,User.class);
          return user;
    }

}
