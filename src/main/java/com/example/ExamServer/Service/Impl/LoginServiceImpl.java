package com.example.ExamServer.Service.Impl;

import com.example.ExamServer.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String CheckPwd(String uname,String pwd)
    {
        return "valid";
    }
}
