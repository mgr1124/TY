package com.mgr.thoseyears0_1.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Logistics {
    @TableId(value = "logistics_id",type = IdType.AUTO)

    private Integer logisticsId;
    private String orderTime;
    private String deliveryTime;
    private String logisticsAddr;
    private String orderId;
    private Integer userId;

}
