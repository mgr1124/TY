package com.mgr.thoseyears0_1.service.impl;

import com.mgr.thoseyears0_1.domain.Address;
import com.mgr.thoseyears0_1.service.IAddressService;
import com.mgr.thoseyears0_1.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddressServiceTestCase {
    @Autowired
    private IAddressService iAddressService;
    @Test
    public void getAddress(){
        Address address = iAddressService.getById(1);
        System.out.println(address);
    }

}
