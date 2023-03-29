package com.mgr.thoseyears0_1.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mgr.thoseyears0_1.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private IBookService bookService;
    @Test
    void testGetById(){
        System.out.println(bookService.getById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setName("小李飞刀7");
        book.setType("小说");
        book.setDescription("武打小说");
        System.out.println(bookService.save(book));
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(6);
        book.setName("小李飞刀6");
        book.setType("小说");
        book.setDescription("武打小说");
        System.out.println(bookService.updateById(book));
    }

    @Test
    void testAll(){
        System.out.println(bookService.list());
    }
    @Test
    void testRemove(){
        bookService.removeById(7);
    }

    @Test
    void testGetPage(){
        IPage<Book> page = new Page<>(1,3);
        bookService.page(page);
        System.out.println(page.getRecords());
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
    }
    @Test
    void testGetPage2(){
        IPage<Book> page = new Page<>(1,3);
        bookService.page(page);
        System.out.println(page.getRecords());
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
    }
}
