package com.example.ExamServer.controller;

import com.example.ExamServer.model.Userinfo;
import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by twinkleStar on 2019/8/26.
 */
@RestController
@RequestMapping("/userinfo")
public class UserinfoController {

    @Autowired
    IUserinfoService iUserinfoService;

    @GetMapping("/test")
    public String LoginTest(String username,String password){
        String valid=iUserinfoService.selectUserTest(username,password);
        return valid;
    }






    /**
     * 单个用户注册
     * @param userinfo
     * @return
     */
    @PostMapping
    public ResponseEntity addSingleUser(Userinfo userinfo) {
        ResponseEntity responseEntity=iUserinfoService.addNewUser(userinfo);
        return responseEntity;
    }


    /**
     * 用户登陆
     * @param username
     * @param password
     * @return
     */
    @GetMapping
    public ResponseEntity userLogin(String username,String password) {
        ResponseEntity responseEntity=iUserinfoService.selectUser(username,password);
        return responseEntity;
    }


}
