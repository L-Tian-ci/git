package com.controller;

import com.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController   //修饰的类下所有方法的返回值跟视图无关
public class MyController {

    @RequestMapping("getU1.do")
    public User getOneU1(){

        return  new User();
    }

    //以下参数都是可以传也可以不传

    //根据uid获取用户信息

    @RequestMapping("getOneU2.do")
    public User getO1(@RequestParam(required = false) String uid){
        System.out.println("uid="+uid);
        return  new User();
    }
    //根据username获取用户信息:返回值是集合
    @RequestMapping("getOneUser.do")
    public  List<User>  getUser(String username){
        List<User> users =new ArrayList<User>();
        return users;
    }

    //根据uid获取username信息：String
    @RequestMapping("getusername.do")
    public String getUserName(String uid){
        return "sb";
    }

    //根据uid获取用户信息:单个bean
    @RequestMapping("getBean.do")
    public User getUserByUid(String uid){
    return new User();
    }
}
