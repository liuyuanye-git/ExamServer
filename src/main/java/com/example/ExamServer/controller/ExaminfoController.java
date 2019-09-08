package com.example.ExamServer.controller;

import com.example.ExamServer.model.entity.ResponseEntity;
import com.example.ExamServer.service.IExaminfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/examinfo")
public class ExaminfoController {
    @Autowired
    IExaminfoService iExaminfoService;

    @PostMapping("/check-exam")
    public ResponseEntity userCheckExam(@RequestBody Map<String,Integer> map) {
        ResponseEntity responseEntity = iExaminfoService.userCheckExam(map.get("user_id"));

        return  responseEntity;
    }
}
