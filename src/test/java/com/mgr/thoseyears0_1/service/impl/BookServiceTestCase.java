package com.mgr.thoseyears0_1.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mgr.thoseyears0_1.dao.BookDao;
import com.mgr.thoseyears0_1.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private BookServiceImpl bookserviceimpl;
    @Autowired
    private BookDao bookDao;

    @Test
    public void save(){
        Book book = new Book();
        book.setName("impl test");
        book.setType("impl test");
        book.setDescription("impl test");
        boolean save = bookserviceimpl.save(book);
        System.out.println(save);
    }
    @Test
    public void getPage111(){
        IPage page = new Page(1,3);
        bookDao.selectPage(page,null);

    }
    @Test
    public void getone(){
        Integer id = 1 ;
        Book book = bookserviceimpl.getById(id);
        System.out.println(book);
    }
}
