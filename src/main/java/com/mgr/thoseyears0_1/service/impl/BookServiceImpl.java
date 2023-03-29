package com.mgr.thoseyears0_1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mgr.thoseyears0_1.dao.BookDao;
import com.mgr.thoseyears0_1.domain.Book;
import com.mgr.thoseyears0_1.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public boolean saveBook(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    public boolean modifyByName(Book book) {
        String name = book.getName();
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper();
        qw.like(name != null,Book::getName,name);
        return bookDao.update(book,qw) > 0;
    }

    @Override
    public boolean deleteByName(String name) {
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper();
        qw.like(name != null,Book::getName,name);
        return bookDao.delete(qw) > 0;
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize, Book book) {
        IPage page = new Page(currentPage,pageSize);
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(Strings.isNotEmpty(book.getType()),Book::getType,book.getType());
        lqw.like(Strings.isNotEmpty(book.getName()),Book::getName,book.getName());
        lqw.like(Strings.isNotEmpty(book.getDescription()),Book::getDescription,book.getDescription());
        bookDao.selectPage(page,lqw);
        return page;
    }
}
