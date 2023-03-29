package com.mgr.thoseyears0_1.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mgr.thoseyears0_1.controller.utils.R;
import com.mgr.thoseyears0_1.domain.Book;
import com.mgr.thoseyears0_1.service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookController {
    @Autowired
    private IBookService iBookService;
    @GetMapping
    public R getAll(){
        return new R(true,iBookService.list());
    }
    @PostMapping
    public R save(@RequestBody Book book){
        return new R(iBookService.save(book));
    }
    @PutMapping
    public R update(@RequestBody Book book){
        return new R(iBookService.updateById(book));
    }
    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(iBookService.removeById(id));
    }
    //http://localhost/books/2
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,iBookService.getById(id));
    }
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize,Book book){
        System.out.println(book);
        IPage<Book> page = iBookService.getPage(currentPage, pageSize,book);
        //如果当前页码值大于总页码，重新执行查询操作，使用最大页码值
        if ( currentPage > page.getPages()){
            page = iBookService.getPage((int) page.getPages(), pageSize,book);
        }
//        log.debug("debug");
        log.info("getPage");
//        log.warn("warn");
//        log.error("error");
        return new R(true,page);
    }

//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
//        IPage<Book> page = iBookService.getPage(currentPage, pageSize);
//        //如果当前页码值大于总页码，重新执行查询操作，使用最大页码值
//        if ( currentPage > page.getPages()){
//            page = iBookService.getPage((int) page.getPages(), pageSize);
//        }
//        return new R(true,page);
//    }




}
