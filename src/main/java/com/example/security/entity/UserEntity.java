package com.example.security.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author xieyunpeng
 * @Date 2024/1/15 17:57
 */
@Data
@TableName("T_UAP_USER")
public class UserEntity {
    private String userid;
    private String username;
    private String userpwd;
}
