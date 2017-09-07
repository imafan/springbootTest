package com.example.demo;

import com.example.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by imafan on 2017-09-07.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<String,User> redisTemplate;


    @Test
    public void test() throws Exception{
        User user = new User();
        user.setNickName("test");

        redisTemplate.opsForValue().set("user", user);

        Assert.assertEquals("test", redisTemplate.opsForValue().get("user").getNickName());

    }
}
