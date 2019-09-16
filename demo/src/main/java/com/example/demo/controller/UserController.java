package com.example.demo.controller;


import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {
static Map<Long,User> userMap= Collections.synchronizedMap(new HashMap<Long, User>());

@RequestMapping(value = "/",method = RequestMethod.GET)
    public List<User> getAllUsers(){
    List<User> userList=new ArrayList<>(userMap.values());
    System.out.println(userMap.toString());
    return userList;
}

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String AddUser(User user){
        userMap.put(user.getId(),user);
        return "ok";
    }

    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public String UpdateUser(User user){
        userMap.put(user.getId(),user);
        return "ok";
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String DeleteUser(@PathVariable Long id){
        User user=userMap.remove(id);
        //删除成功返回空
        System.out.println(user==null?"null":user.toString());
        return "ok";
    }
}
