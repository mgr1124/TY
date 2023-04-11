package com.mgr.thoseyears0_1.service.impl;

import com.mgr.thoseyears0_1.domain.Logistics;
import com.mgr.thoseyears0_1.service.ILogisticsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LogisticsServiceTestCase {
    @Autowired
    private ILogisticsService iLogisticsService;
    @Test
    public void getLogistics(){
        Logistics Logistics = iLogisticsService.getById(1);
        System.out.println(Logistics);
    }

}
