package com.mgr.thoseyears0_1.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mgr.thoseyears0_1.domain.Order;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface OrderDao extends BaseMapper<Order> {
        // 多表关联sql语句自己写；分页以及条件用mp,返回值是Map
        @MapKey("orderId")
        IPage<Map<String, Object>> selectOrderPageMap(Page page, @Param(Constants.WRAPPER) Wrapper<Order> queryWrapper);

}
