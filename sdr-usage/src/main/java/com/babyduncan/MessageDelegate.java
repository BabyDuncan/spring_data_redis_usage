package com.babyduncan;

import java.io.Serializable;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/18/13 16:23
 */
public interface MessageDelegate {

    void handleMessage(Serializable message, String channel);

}
