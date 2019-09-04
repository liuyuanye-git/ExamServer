package com.example.ExamServer.service;

import com.example.ExamServer.model.Groupinfo;
import com.example.ExamServer.model.entity.ResponseEntity;

/**
 * Created by twinkleStar on 2019/9/4.
 */
public interface IGroupinfoService {

    ResponseEntity addGroupinfo(Groupinfo groupinfo);
}
