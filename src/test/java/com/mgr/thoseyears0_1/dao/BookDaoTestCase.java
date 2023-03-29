package com.mgr.thoseyears0_1.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mgr.thoseyears0_1.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }
    @Test
    void testSave(){
        Book book = new Book();
        book.setType("小说");
        book.setName("神雕侠侣");;
        book.setDescription("经典小说神雕侠侣");
        bookDao.insert(book);
    }
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(4);
        book.setType("小说");
        book.setName("三毛");;
        book.setDescription("三毛经典小说");
        bookDao.updateById(book);
    }
    @Test
    void testDelete(){
        bookDao.deleteById(4);
    }
    @Test
    void testGetAll(){
        bookDao.selectList(null);
//        System.out.println(bookDao.selectList(null));
    }
    @Test
    void testGetPage(){
        IPage page = new Page(2,3);
        bookDao.selectPage(page,null);
        System.out.println(page.getRecords());
    }
    @Test
    void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","数据");
        bookDao.selectList(qw);
    }
    @Test
    void testGetBy2(){
        String name = null;
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(name != null,Book::getName,name);
        bookDao.selectList(lqw);
    }


}
