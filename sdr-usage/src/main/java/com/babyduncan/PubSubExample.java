package com.babyduncan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/18/13 16:04
 */
@Service
public class PubSubExample {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void pub(Serializable s) {
        redisTemplate.convertAndSend("chatroom", s);
    }

}
