package com.mgr.thoseyears0_1.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mgr.thoseyears0_1.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
