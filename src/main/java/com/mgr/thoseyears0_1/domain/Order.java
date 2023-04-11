package com.mgr.thoseyears0_1.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Order {
    @TableId(value = "order_id",type = IdType.AUTO)
    private Integer orderId;
    private String orderSender;
    private String orderConsignee;
    private String orderType;
    private double orderWeight;
    private float orderCost;
    private boolean orderState;

}
