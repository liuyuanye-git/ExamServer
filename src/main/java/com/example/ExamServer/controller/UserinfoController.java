package com.example.ExamServer.controller;

import com.example.ExamServer.dao.UserinfoMapper;
import com.example.ExamServer.model.Userinfo;
import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by twinkleStar on 2019/8/26.
 */
@RestController
@RequestMapping("/userinfo")
public class UserinfoController {

    @Autowired
    IUserinfoService iUserinfoService;


    /**
     * 单个用户注册
     * @param userinfo
     * @return
     */
//    @PostMapping
//    public ResponseEntity addSingleUser(@RequestBody Userinfo userinfo) {
//        ResponseEntity responseEntity=iUserinfoService.addNewUser(userinfo);
//        return responseEntity;
//    }


    /**
     * 用户登陆
     * 参数：user_name,password
     * @param map
     * @return
     */
    @PostMapping("/login")
    public ResponseEntity userLogin(@RequestBody Map<String,String> map) {
        ResponseEntity responseEntity = iUserinfoService.selectUser(map.get("user_name"), map.get("password"));
        return responseEntity;
    }

}
