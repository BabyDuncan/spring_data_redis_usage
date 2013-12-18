package com.babyduncan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/18/13 16:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:sdrc-applicationContext.xml")
public class DefaultMessageDelegateTest {

    @Autowired
    private PubSubExample pub;

    @Test
    public void testHandleMessage() throws Exception {
        pub.pub("aaa");
    }
}
