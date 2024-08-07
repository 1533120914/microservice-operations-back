package com.heavenly.secret.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableId(type = IdType.ASSIGN_UUID)
    private Long id;
    @TableField(value = "account")
    private String account;
    @TableField(value = "password")
    private String password;
    @TableField(value = "wechat")
    private String wechat;
    @TableField(value = "is_delete")
    @TableLogic(value = "0",delval = "1")
    private Integer isDelete;
}
