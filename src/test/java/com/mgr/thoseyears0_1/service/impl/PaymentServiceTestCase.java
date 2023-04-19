package com.mgr.thoseyears0_1.service.impl;

import com.mgr.thoseyears0_1.domain.Payment;
import com.mgr.thoseyears0_1.service.IPaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PaymentServiceTestCase {
    @Autowired
    private IPaymentService iPaymentService;
    @Test
    public void getPayment(){
        Payment Payment = iPaymentService.getById(1);
        System.out.println(Payment);
    }

}
