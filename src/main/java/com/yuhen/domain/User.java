package com.yuhen.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

// 使用mybatis plus
@Data
@TableName("user")
public class User {
    @TableId
    private int id;
    private String name;
    private String password;
    private String email;
    private boolean status;
    private String avatar;
    private Timestamp CreateTime;
    private boolean DeleteStatus;
    private int UserType;
}
