package com.mgr.thoseyears0_1.controller.utils;

import com.mgr.thoseyears0_1.domain.Address;
import com.mgr.thoseyears0_1.domain.Logistics;
import com.mgr.thoseyears0_1.domain.Order;
import lombok.Data;

@Data
public class LogisticsUtils {
    private Logistics logistics;
    private Order order;
    private Address addressSender;
    private Address addressConsignee;

    public LogisticsUtils(Logistics logistics,Order order,Address addressSender,Address addressConsignee){
        this.logistics = logistics;
        this.order = order;
        this.addressSender = addressSender;
        this.addressConsignee = addressConsignee;
    }

}
