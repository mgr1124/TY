package com.mgr.thoseyears0_1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest(properties = {"test.prop=testValue1"})
//@SpringBootTest(args = {"--test.prop=testValues2"})
@SpringBootTest(properties = {"test.prop=testValue1"},args={"--test.prop=testValues2"})
public class propertiesAndArgsTest {
    @Value("${test.prop}")
    private String msg;
    @Test
    void testProperties(){
        System.out.println(msg);
    }
}
