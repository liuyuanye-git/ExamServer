package com.example.ExamServer.controller;

import com.example.ExamServer.model.Groupinfo;
import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IGroupinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by twinkleStar on 2019/9/4.
 */

@RestController
@RequestMapping("/groupinfo")
public class GroupinfoController {

    @Autowired
    IGroupinfoService iGroupinfoService;

    @PostMapping
    public ResponseEntity addSingleUser(@RequestBody Groupinfo groupinfo) {
        ResponseEntity responseEntity=iGroupinfoService.addGroupinfo(groupinfo);
        return responseEntity;
    }


    @PostMapping("/userid")
    public ResponseEntity getGroupByUserId(@RequestBody Map<String,Integer> map) {
        ResponseEntity responseEntity=iGroupinfoService.getGroupByUserId(map.get("id"));
        return responseEntity;
    }
}
