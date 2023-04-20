package com.mgr.thoseyears0_1.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mgr.thoseyears0_1.domain.Order;
import com.mgr.thoseyears0_1.domain.dto.OrderDto;

public interface IOrderService extends IService<Order> {
    IPage<Order> getPage(int currentPage, int pageSize, Order Order);
    IPage<OrderDto> getPageOrderDto(int currentPage, int pageSize, Order Order);

}
