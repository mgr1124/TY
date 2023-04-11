package com.mgr.thoseyears0_1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mgr.thoseyears0_1.dao.OrderDao;
import com.mgr.thoseyears0_1.domain.Order;
import com.mgr.thoseyears0_1.service.IOrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements IOrderService {

}
