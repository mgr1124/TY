package com.mgr.thoseyears0_1.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class RedisTests {
//    @Autowired
//    //以对象的形式，实际key是对象
//    private RedisTemplate redisTemplate;
//    @Autowired
//    //以字符串，可以和用redis的数据保持一致
//    private StringRedisTemplate stringRedisTemplate;
//    @Test
//    void set() {
//        ValueOperations ops = redisTemplate.opsForValue();
//        ops.set("age",41);
//    }
//    @Test
//    void get() {
//        ValueOperations ops = redisTemplate.opsForValue();
//        Object age = ops.get("age");
//        System.out.println(age);
//    }
//    @Test
//    void hset() {
//        HashOperations ops = redisTemplate.opsForHash();
//        ops.put("infor","a","aa");
//    }
//    @Test
//    void hget() {
//        HashOperations ops = redisTemplate.opsForHash();
//        Object val = ops.get("infor","a");
//        System.out.println(val);
//    }
//
//    @Test
//    void setstring (){
//        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
//        ops.set("name","xiaoming");
//    }    @Test
//    void getstring (){
//        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
//        String name = ops.get("name");
//        System.out.println(name);
//    }


}
