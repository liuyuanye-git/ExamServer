package com.example.ExamServer.controller;

import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IGroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by twinkleStar on 2019/9/3.
 */

@RestController
@RequestMapping("/groupuser")
public class GroupUserController {

    @Autowired
    IGroupUserService iGroupUserService;

    @GetMapping("/info")
    public ResponseEntity userLogin() {
        ResponseEntity responseEntity = iGroupUserService.getGroupUserInfo();
        return responseEntity;
    }
}
