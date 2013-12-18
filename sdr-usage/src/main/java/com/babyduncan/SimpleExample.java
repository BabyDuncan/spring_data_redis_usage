package com.babyduncan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/18/13 15:20
 */
@Service
public class SimpleExample {

    // inject the actual template
//    @Autowired
//    private RedisTemplate<String, String> template;
    // inject the template as ListOperations

    @Resource(name = "redisTemplate")
    private ListOperations<String, String> listOps;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void addLink(String userId, String url) {
        System.out.println(listOps.leftPush(userId, url));
        System.out.println(listOps.rightPop(userId));
    }

    public void stringTest() {
        System.out.println(stringRedisTemplate.opsForValue().get("babyduncan"));
    }


}
