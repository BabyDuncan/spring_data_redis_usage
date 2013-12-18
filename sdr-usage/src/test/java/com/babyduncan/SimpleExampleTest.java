package com.babyduncan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/18/13 15:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:sdr-applicationContext.xml")
public class SimpleExampleTest {

    @Autowired
    SimpleExample simpleExample;

    @Test
    public void testAddLink() throws Exception {
        simpleExample.addLink("foobar", "http://www.sohu.com");
    }

    @Test
    public void testString() {
        simpleExample.stringTest();
    }
}
