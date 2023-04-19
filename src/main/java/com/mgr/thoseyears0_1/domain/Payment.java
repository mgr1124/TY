package com.mgr.thoseyears0_1.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Payment {
    @TableId(value = "pay_id",type = IdType.AUTO)
    private Integer payId;
    private String payType;
    private String payTime;
    private double payCost;
    private String orderId;

}
