package com.mgr.thoseyears0_1.domain.dto;

import com.mgr.thoseyears0_1.domain.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OrderDto extends Order {
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
    private String senderaddrId;
    private Integer senderuserId;
    private String senderaddrLinkman;
    private String senderaddrTelephone;
    private String senderaddrDes;
    private String senderaddrTag;
    private String consigneeaddrId;
    private Integer consigneeuserId;
    private String consigneeaddrLinkman;
    private String consigneeaddrTelephone;
    private String consigneeaddrDes;
    private String consigneeaddrTag;
    private Integer payId;
    private String payType;
    private String payTime;
    private double payCost;
}
