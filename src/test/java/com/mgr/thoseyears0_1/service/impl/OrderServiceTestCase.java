package com.mgr.thoseyears0_1.service.impl;

import com.mgr.thoseyears0_1.domain.Order;
import com.mgr.thoseyears0_1.service.IOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderServiceTestCase {
    @Autowired
    private IOrderService iOrderService;
    @Test
    public void getOrder(){
        Order Order = iOrderService.getById(1);
        System.out.println(Order);
    }

}
