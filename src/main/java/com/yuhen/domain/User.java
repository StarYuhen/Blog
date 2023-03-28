package com.yuhen.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

// 使用mybatis plus
@Data
@TableName("user")
public class User {
    @TableId
    // 使用包装器防止默认值
    private Integer id;
    private String name;
    private String password;
    private String email;
    private boolean status;
    private String avatar;
    @TableField("create_time")
    private Timestamp CreateTime;
    @TableField("delete_status")
    private boolean DeleteStatus;
    @TableField("user_type")
    private int UserType;
}
