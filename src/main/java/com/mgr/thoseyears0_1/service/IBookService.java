package com.mgr.thoseyears0_1.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mgr.thoseyears0_1.domain.Book;

public interface IBookService extends IService<Book> {
    boolean saveBook(Book book);
    boolean modifyByName(Book book);
    boolean deleteByName(String name);
    IPage<Book> getPage(int currentPage, int pageSize, Book book);

}
