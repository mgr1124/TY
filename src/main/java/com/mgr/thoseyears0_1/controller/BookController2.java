package com.mgr.thoseyears0_1.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mgr.thoseyears0_1.domain.Book;
import com.mgr.thoseyears0_1.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private IBookService iBookService;
    @GetMapping
    public List<Book> getAll(){
        return iBookService.list();
    }
    @PostMapping
    public Boolean save(@RequestBody Book book){
        return iBookService.save(book);
    }
    @PutMapping
    public Boolean update(@RequestBody Book book){
        return iBookService.updateById(book);
    }
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return iBookService.removeById(id);
    }
    //http://localhost/books/2
    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return iBookService.getById(id);
    }
    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable int pageSize,Book book){
        return iBookService.getPage(currentPage,pageSize, book);
    }




}
