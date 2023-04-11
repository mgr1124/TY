package com.mgr.thoseyears0_1.controller;

import com.mgr.thoseyears0_1.controller.utils.LogisticsUtils;
import com.mgr.thoseyears0_1.controller.utils.R;
import com.mgr.thoseyears0_1.domain.Address;
import com.mgr.thoseyears0_1.domain.Logistics;
import com.mgr.thoseyears0_1.domain.Order;
import com.mgr.thoseyears0_1.service.IAddressService;
import com.mgr.thoseyears0_1.service.ILogisticsService;
import com.mgr.thoseyears0_1.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/logistics")
@CrossOrigin
public class LogisticsController {
    @Autowired
    private ILogisticsService iLogisticsService;
    @Autowired
    private IOrderService iOrderService;
    @Autowired
    private IAddressService iAddressService;

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        try {
            Logistics logistics = iLogisticsService.getById(id);
            Order order = iOrderService.getById(logistics.getOrderId());
            Address addressSender = iAddressService.getById(order.getOrderSender());
            Address addressConsignee = iAddressService.getById(order.getOrderConsignee());
            LogisticsUtils logisticsUtils = new LogisticsUtils(logistics, order, addressSender, addressConsignee);
            System.out.println(logisticsUtils);
            return new R(true,logisticsUtils);
        }catch (Exception e){
            e.printStackTrace();
            return new R(false);
        }

    }



}
