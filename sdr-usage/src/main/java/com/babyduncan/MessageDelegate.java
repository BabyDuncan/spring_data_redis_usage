package com.babyduncan;

import java.io.Serializable;
import java.util.Map;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/18/13 16:23
 */
public interface MessageDelegate {

    void handleMessage(String message);

    void handleMessage(Map message);

    void handleMessage(byte[] message);

    void handleMessage(Serializable message);

    // pass the channel/pattern as well
    void handleMessage(Serializable message, String channel);

    void handleMessage(String message, String channel);

}
