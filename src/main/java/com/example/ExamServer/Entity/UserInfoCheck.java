package com.example.ExamServer.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserInfoCheck {
    private String user_name;
    private String password;
}
