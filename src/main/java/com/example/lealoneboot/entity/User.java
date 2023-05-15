package com.example.lealoneboot.entity;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@TableName("sys_user")
public class User {
    /**
     * 用户ID
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户账号
     */
    private String username;

    /**
     * 用户昵称
     */
    private String nickname;


    /**
     * 手机号码
     */
    private String phone;

    /**
     * 用户性别 (1男 0女 2未知)
     */
    private Integer gender;


    /**
     * 密码
     */
    private String password;


    /**
     * 备注
     */
    private String memo;

    private String createdBy;

    /**
     * 创建时间
     */

    private LocalDateTime createdAt;
}