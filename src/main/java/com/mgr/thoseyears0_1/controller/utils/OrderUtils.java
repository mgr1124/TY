package com.mgr.thoseyears0_1.controller.utils;

import com.mgr.thoseyears0_1.domain.Address;
import com.mgr.thoseyears0_1.domain.Logistics;
import com.mgr.thoseyears0_1.domain.Order;
import com.mgr.thoseyears0_1.domain.Payment;
import lombok.Data;

@Data
public class OrderUtils {
    private Order order;
    private Address addressSender;
    private Address addressConsignee;
    private Payment payment;

    public Order getOrder() {
        return order;
    }

    public Address getAddressSender() {
        return addressSender;
    }

    public Address getAddressConsignee() {
        return addressConsignee;
    }

    public Payment getPayment() {
        return payment;
    }

    public OrderUtils(Order order, Address addressSender, Address addressConsignee, Payment payment) {
        this.order = order;
        this.addressSender = addressSender;
        this.addressConsignee = addressConsignee;
        this.payment = payment;
    }

}
