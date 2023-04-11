package com.mgr.thoseyears0_1.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Address {
    @TableId(value = "addr_id",type = IdType.AUTO)
    private String addrId;
    private Integer userId;
    private String addrLinkman;
    private String addrDes;
    private String addrTag;
}
