package com.whisper.springln.controller;


import com.whisper.springln.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${user.userServiceUrl}")  //使用yml变量，一定要使用${}
    private String userServiceUrl;
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        String url=this.userServiceUrl+"user/"+id;
        System.out.println(url);
        return this.restTemplate.getForObject(url,User.class);
    }
}
