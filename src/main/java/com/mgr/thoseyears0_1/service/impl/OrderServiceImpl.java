package com.mgr.thoseyears0_1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mgr.thoseyears0_1.dao.OrderDao;
import com.mgr.thoseyears0_1.domain.Address;
import com.mgr.thoseyears0_1.domain.Order;
import com.mgr.thoseyears0_1.domain.dto.OrderDto;
import com.mgr.thoseyears0_1.service.IOrderService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
    public IPage<Map<String, Object>> getPageOrderDto(int currentPage, int pageSize, OrderDto orderDto) {
        Page<Order> page = new Page<>(currentPage,pageSize);
        // 条件
        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(orderDto.getOrderUserid() != null,"torder.order_userid",orderDto.getOrderUserid())
                .like(orderDto.getOrderId() != null,"torder.order_id",orderDto.getOrderId())
                .eq((orderDto.getOrderType() != null) && !(orderDto.getOrderType().equals("全部")),"torder.order_type",orderDto.getOrderType())
                .eq(orderDto.getConsigneeaddrLinkman() != null,"taddress2.addr_linkman",orderDto.getConsigneeaddrLinkman());
        IPage<Map<String, Object>> mapIPage = orderDao.selectOrderPageMap(page, queryWrapper);
//        List<Map<String, Object>> records = mapIPage.getRecords();
        return mapIPage;
    }

}
