package com.mgr.thoseyears0_1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class WebTest {

    @Test
    void testById(@Autowired MockMvc mvc) throws Exception{
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books/1/10?type=1&name=1&description=1");
        ResultActions actions = mvc.perform(builder);
        //测试状态
        StatusResultMatchers status = MockMvcResultMatchers.status();
        ResultMatcher ok = status.isOk();
        actions.andExpect(ok);
        //测试结果，json
        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher result = content.string("{\"flag\":true,\"data\":{\"records\":[{\"id\":34,\"type\":\"1\",\"name\":\"1\",\"description\":\"1\"}],\"total\":1,\"size\":10,\"current\":1,\"orders\":[],\"optimizeCountSql\":true,\"searchCount\":true,\"maxLimit\":null,\"countId\":null,\"pages\":1}}");
        actions.andExpect(result);
        //测试相应头
        HeaderResultMatchers header = MockMvcResultMatchers.header();
        ResultMatcher contentType = header.string("Content-Type", "application/json");
        actions.andExpect(contentType);
    }

    @Test
    void testRandomPort(){
    }
//    @Test
//    void testWeb(@Autowired MockMvc mvc) throws Exception{
//        //模拟请求
//        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
//        //执行请求
//        mvc.perform(builder);
//    }
//    @Test
//    void testStatus(@Autowired MockMvc mvc) throws Exception{
//        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
//        ResultActions actions = mvc.perform(builder);
//
//        //设定预期值，与真实值比较，成功测试通过，失败测试失败
//        StatusResultMatchers status = MockMvcResultMatchers.status();
//        //预计本次调用成功，状态200
//        ResultMatcher ok = status.isOk();
//        ResultMatcher is_not_found = status.isNotFound();
//        //添加预计值到本次过程中进行匹配
//        actions.andExpect(ok);
//    }
//
//    @Test
//    void testBody(@Autowired MockMvc mvc) throws Exception{
//        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books/1/10?type=1&name=1&description=1");
//        ResultActions actions = mvc.perform(builder);
//
//        //设定预期值，与真实值比较，成功测试通过，失败测试失败
//        ContentResultMatchers content = MockMvcResultMatchers.content();
//        //预计本次调用成功，
//        ResultMatcher result = content.string("{\"flag\":true,\"data\":{\"records\":[{\"id\":34,\"type\":\"1\",\"name\":\"1\",\"description\":\"1\"}],\"total\":1,\"size\":10,\"current\":1,\"orders\":[],\"optimizeCountSql\":true,\"searchCount\":true,\"maxLimit\":null,\"countId\":null,\"pages\":1}}");
//        //添加预计值到本次过程中进行匹配
//        actions.andExpect(result);
//    }
//    @Test
//    void testContentType(@Autowired MockMvc mvc) throws Exception{
//        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
//        ResultActions actions = mvc.perform(builder);
//
//        //设定预期值，与真实值比较，成功测试通过，失败测试失败
//        HeaderResultMatchers header = MockMvcResultMatchers.header();
//        ResultMatcher contentType = header.string("Content-Type", "application/json");
//        //添加预计值到本次过程中进行匹配
//        actions.andExpect(contentType);
//    }

}
