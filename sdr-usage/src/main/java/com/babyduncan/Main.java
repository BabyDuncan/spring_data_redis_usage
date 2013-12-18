package com.babyduncan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/18/13 16:38
 */
public class Main {

    public static void main(String... args) {
        new ClassPathXmlApplicationContext("sdr-applicationContext.xml");
    }

}
