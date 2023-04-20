package com.mgr.thoseyears0_1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mgr.thoseyears0_1.dao.OrderDao;
import com.mgr.thoseyears0_1.domain.Order;
import com.mgr.thoseyears0_1.service.IOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;


@SpringBootTest
public class OrderServiceTestCase {
    @Autowired
    private IOrderService iOrderService;
    @Autowired
    private OrderDao orderDao;

    @Test
    public void getOrder(){
        Order Order = iOrderService.getById(1);
        System.out.println(Order);
    }
    @Test
    public void getPage111(){
        IPage page = new Page(1,3);
        orderDao.selectPage(page,null);
    }
    //使用MP的QueryWrapper来完成连表查询并分页
    @Test
    public void findOrdersByPageMap(){
        // 0为pageNo,2为pageSize
        Page<Order> page = new Page<>(0,2);

        Order order = new Order();
        order.setOrderUserid(1);;

        // 条件
        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(order.getOrderUserid() != null,"torder.order_id",order.getOrderUserid());

        IPage<Map<String, Object>> mapIPage = orderDao.selectOrderPageMap(page, queryWrapper);
        List<Map<String, Object>> records = mapIPage.getRecords();
        records.forEach(System.out::println);
        System.out.println("总数是:"+mapIPage.getTotal());
        System.out.println("共有"+mapIPage.getPages()+"页");
        System.out.println("当前是第"+mapIPage.getCurrent()+"页");

    }


}
