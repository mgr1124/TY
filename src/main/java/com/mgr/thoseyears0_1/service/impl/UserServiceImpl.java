package com.mgr.thoseyears0_1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mgr.thoseyears0_1.dao.UserDao;
import com.mgr.thoseyears0_1.domain.Book;
import com.mgr.thoseyears0_1.domain.User;
import com.mgr.thoseyears0_1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean saveUser(User user) {
        return false;
    }

    @Override
    public boolean modifyByName(User user) {
        return false;
    }

    @Override
    public boolean deleteByName(String name) {
        return false;
    }

    @Override
    public User getByUserid(Integer userId) {
        LambdaQueryWrapper<User> qw = new LambdaQueryWrapper();
        qw.like(userId != null,User::getUserId,userId);
        User user = userDao.selectOne(qw);
        System.out.println(user);
        return user;
    }
}
