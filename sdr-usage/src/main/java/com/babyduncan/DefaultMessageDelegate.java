package com.babyduncan;

import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Map;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/18/13 16:23
 */
@Service
public class DefaultMessageDelegate implements MessageDelegate {
    @Override
    public void handleMessage(String message) {
        System.out.println("1========" + message);
    }

    @Override
    public void handleMessage(Map message) {
        System.out.println("2========" + message);
    }

    @Override
    public void handleMessage(byte[] message) {
        System.out.println("3========" + new String(message));
    }

    @Override
    public void handleMessage(Serializable message) {
        System.out.println("4========" + message);
    }

    @Override
    public void handleMessage(Serializable message, String channel) {
        System.out.println("5========" + message + "channel is " + channel);
    }

    @Override
    public void handleMessage(String message, String channel) {
        System.out.println("6========" + message + "channel is " + channel);
    }
}
