package com.mgr.thoseyears0_1.controller;

import com.mgr.thoseyears0_1.controller.utils.R;
import com.mgr.thoseyears0_1.domain.User;
import com.mgr.thoseyears0_1.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("{id}/{password}")
    public R getById(@PathVariable Integer id,@PathVariable String password){
        User user = iUserService.getById(id);
        if (user.getUserPassword().equals(password)){
            return new R(true,iUserService.getById(id));
        }
        return new R(false);
    }



}
