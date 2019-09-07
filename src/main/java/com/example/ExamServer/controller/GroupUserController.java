package com.example.ExamServer.controller;

import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IGroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;


/**
 * Created by twinkleStar on 2019/9/3.
 */

@RestController
@RequestMapping("/groupuser")
public class GroupUserController {

    @Autowired
    IGroupUserService iGroupUserService;


    /**
     * 获取所有组及其成员列表
     * todo:后期加上admin权限，仅可查看有权限的组（比如自己创建的）
     * @return
     */
    @GetMapping("/info")
    public ResponseEntity getGroupUser() {
        ResponseEntity responseEntity = iGroupUserService.getGroupUserInfo();
        return responseEntity;
    }

    @PostMapping("/new")
    public ResponseEntity addNew(@RequestBody Map<String,Object> map) {
        ResponseEntity responseEntity = iGroupUserService.addNewGroupUser(map);
        return responseEntity;
    }

    @PostMapping("/info")
    public ResponseEntity getGroupUserByGid(@RequestBody Map<String,Integer> map) {
        ResponseEntity responseEntity = iGroupUserService.getGroupUserByGid(map.get("id"));
        return responseEntity;
    }

}
