package com.example.ExamServer;

import com.example.ExamServer.dao.UserinfoMapper;
import com.example.ExamServer.model.Userinfo;
import org.hibernate.validator.constraints.Range;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    UserinfoMapper userinfoMapper;

    @Test
    public void contextLoads() {

        List<String> test=userinfoMapper.selectTest();
        for(String str:test){
            System.out.println(str);

        }

    }

}
