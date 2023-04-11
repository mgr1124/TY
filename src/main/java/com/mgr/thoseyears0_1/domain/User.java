package com.mgr.thoseyears0_1.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data

public class User extends Person{
    @TableId(value = "user_Id",type = IdType.AUTO)


    private Integer userId;
    private String userName;
    private String userPassword;
    private String userTelephone;
    private String userWechat;

}
