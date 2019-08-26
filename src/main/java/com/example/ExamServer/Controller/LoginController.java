package com.example.ExamServer.Controller;

import com.example.ExamServer.Entity.ServerResponse;
import com.example.ExamServer.Entity.UserInfoCheck;
import com.example.ExamServer.Service.Impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginServiceImpl loginServiceImpl;

    @RequestMapping("/login/check")
    public ServerResponse Check(@RequestBody UserInfoCheck user_info_check) throws JSONException {
        String asd= user_info_check.getPassword();
        String status = loginServiceImpl.CheckPwd("admin","admin");
        ServerResponse response = ServerResponse.builder().msg(status).build();
        return response;
    }

}


