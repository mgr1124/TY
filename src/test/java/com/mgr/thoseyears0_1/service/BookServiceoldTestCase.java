package com.mgr.thoseyears0_1.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mgr.thoseyears0_1.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceoldTestCase {
    @Autowired
    private BookService bookService;
    @Test
    void testGetById(){
        System.out.println(bookService.getById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setName("小李飞刀");
        book.setType("小说");
        book.setDescription("武打小说");
        System.out.println(bookService.save(book));
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(5);
        book.setName("小李飞刀5");
        book.setType("小说");
        book.setDescription("武打小说");
        System.out.println(bookService.update(book));
    }

    @Test
    void testAll(){

        System.out.println(bookService.getAll());
    }

    @Test
    void testGetPage(){
        IPage<Book> page = bookService.getPage(2,3);
        System.out.println(page.getRecords());
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
    }

}
