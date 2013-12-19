package com.babyduncan;

import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/18/13 16:23
 */
@Service
public class DefaultMessageDelegate implements MessageDelegate {

    @Override
    public void handleMessage(Serializable message, String channel) {
        System.out.println("========" + message.toString() + " channel is " + channel);
    }
}
