package com.mgr.thoseyears0_1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mgr.thoseyears0_1.domain.User;

public interface IUserService extends IService<User> {
    boolean saveUser(User user);
    boolean modifyByName(User user);
    boolean deleteByName(String name);
    User getByUserid(Integer userId);
}
