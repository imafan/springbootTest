package com.example.demo;

import com.example.entity.User;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by imafan on 2017-09-07.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;


    @Test
    public void test() throws Exception{
        User user = new User();
        user.setNickName("test");

        List<User> test = Lists.newArrayList();
        test.add(user);

        redisTemplate.opsForValue().set("user", test);

        Assert.assertEquals("test", ((List<User>) redisTemplate.opsForValue().get("user")).get(0).getNickName());

    }
}
