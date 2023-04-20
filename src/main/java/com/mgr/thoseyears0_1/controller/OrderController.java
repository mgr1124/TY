package com.mgr.thoseyears0_1.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mgr.thoseyears0_1.controller.utils.OrderUtils;
import com.mgr.thoseyears0_1.controller.utils.R;
import com.mgr.thoseyears0_1.domain.Address;
import com.mgr.thoseyears0_1.domain.Book;
import com.mgr.thoseyears0_1.domain.Order;
import com.mgr.thoseyears0_1.domain.Payment;
import com.mgr.thoseyears0_1.service.IAddressService;
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
    private IOrderService iOrderService;
    @Autowired
    private IAddressService iAddressService;
    @Autowired
    private IPaymentService iPaymentService;
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize, Integer userId){
        System.out.println(userId);
        Order order = new Order();
        order.setOrderUserid(userId);
        IPage<Order> page = iOrderService.getPage(currentPage, pageSize,order);
        //如果当前页码值大于总页码，重新执行查询操作，使用最大页码值
        if ( currentPage > page.getPages()){
            page = iOrderService.getPage((int) page.getPages(), pageSize,order);
        }
        return new R(true,page);
    }
    @PostMapping
    public R save(@RequestBody OrderUtils orderUtils){
        String strAddrsend = serviceselect(iAddressService);
        String strAddrcons = serviceselect(iAddressService);
        String strOrderId = serviceselect(iOrderService);
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

        if ( iAddressService.save(addressSender) && iAddressService.save(addressConsignee)
                && iOrderService.save(order) && iPaymentService.save(payment) ){
            log.info("success");
            return new R(true);
        }
        log.info("error");
        return new R(false);
    }
    //方法
    private String serviceselect(IService iService){
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
