package com.mgr.thoseyears0_1.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mgr.thoseyears0_1.controller.utils.LogisticsUtils;
import com.mgr.thoseyears0_1.controller.utils.OrderUtils;
import com.mgr.thoseyears0_1.controller.utils.R;
import com.mgr.thoseyears0_1.domain.Address;
import com.mgr.thoseyears0_1.domain.Order;
import com.mgr.thoseyears0_1.domain.Logistics;
import com.mgr.thoseyears0_1.domain.Payment;
import com.mgr.thoseyears0_1.service.IAddressService;
import com.mgr.thoseyears0_1.service.ILogisticsService;
import com.mgr.thoseyears0_1.service.IOrderService;
import com.mgr.thoseyears0_1.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {
    @Autowired
    private ILogisticsService iLogisticsService;
    @Autowired
    private IOrderService iOrderService;
    @Autowired
    private IAddressService iAddressService;
    @Autowired

    private IPaymentService iPaymentService;
    @PostMapping
    public R save(@RequestBody OrderUtils orderUtils){
        String strAddrsend = selectstr(iAddressService);
        String strAddrcons = selectstr(iAddressService);
        String strOrderId = selectstr(iOrderService);
//        System.out.println(orderUtils);
//        System.out.println(orderUtils.getOrder());
//        System.out.println(orderUtils.getAddressSender());
//        System.out.println(orderUtils.getAddressConsignee());
//        System.out.println(orderUtils.getPayment());
        //数据整理
        Order order = orderUtils.getOrder();
        order.setOrderId(strOrderId);
        order.setOrderSender(strAddrsend);
        order.setOrderConsignee(strAddrcons);

        Address addressSender = orderUtils.getAddressSender();
        addressSender.setAddrId(strAddrsend);

        Address addressConsignee = orderUtils.getAddressConsignee();
        addressConsignee.setAddrId(strAddrcons);

        Payment payment = orderUtils.getPayment();
        payment.setOrderId(strOrderId);
//        System.out.println(order);
//        System.out.println(addressSender);
//        System.out.println(addressConsignee);
//        System.out.println(payment);
        if ( iAddressService.save(addressSender) && iAddressService.save(addressConsignee)
                && iOrderService.save(order) && iPaymentService.save(payment) ){
            log.info("success");
            return new R(true);
        }
        log.info("error");
        return new R(false);
    }
    private String selectstr(IService iService){
        String str = RandomStringUtils.randomNumeric(30);
        int count = 0;
        while (iService.getById(str)!=null) {
            str = RandomStringUtils.randomNumeric(30);
            count++;
            if (count >= 3){ log.info("三次以上没成功"); }
        }
        return str;
    }

}
