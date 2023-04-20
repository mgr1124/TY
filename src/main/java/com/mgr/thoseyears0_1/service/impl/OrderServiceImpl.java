package com.mgr.thoseyears0_1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mgr.thoseyears0_1.dao.OrderDao;
import com.mgr.thoseyears0_1.domain.Order;
import com.mgr.thoseyears0_1.domain.dto.OrderDto;
import com.mgr.thoseyears0_1.service.IOrderService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements IOrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public IPage<Order> getPage(int currentPage, int pageSize, Order order) {
        IPage page = new Page(currentPage,pageSize);
        LambdaQueryWrapper<Order> lqw = new LambdaQueryWrapper<>();
        lqw.eq((order.getOrderUserid()!=null),Order::getOrderUserid,order.getOrderUserid());
        orderDao.selectPage(page,lqw);
        return page;
    }

    @Override
    public IPage<OrderDto> getPageOrderDto(int currentPage, int pageSize, Order Order) {
//        LambdaQueryWrapper
        return null;
    }
}
