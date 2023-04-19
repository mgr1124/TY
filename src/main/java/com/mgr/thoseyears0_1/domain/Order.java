package com.mgr.thoseyears0_1.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Order {
    @TableId(value = "order_id",type = IdType.AUTO)
    private String orderId;
    private Integer orderUserid;
    private String orderSender;
    private String orderConsignee;
    private String orderType;
    private double orderWeight;
    private double orderVolume;
    private float orderCost;
    private boolean orderState; //'订单状态，是否支付'
    private String orderSendtype; //寄件方式
    private String orderPickuptime; //上门取件时间
    private String orderCouriernumber; //邮寄单号
    private String orderCommodity; //邮寄物品
    private String orderDesc; //描述

}
