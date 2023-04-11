package com.mgr.thoseyears0_1.service.impl;

import com.mgr.thoseyears0_1.domain.Book;
import com.mgr.thoseyears0_1.domain.User;
import com.mgr.thoseyears0_1.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTestCase {
    @Autowired
    private IUserService iUserService;
    @Test
    public void getbyid(){
        Integer id = 1;
        User user = iUserService.getByUserid(id);
        System.out.println(user);
    }
    @Test
    public void getbyid2(){
        Integer id = 1;
        User user1 = iUserService.getById(id);
        System.out.println(user1);
    }


}
