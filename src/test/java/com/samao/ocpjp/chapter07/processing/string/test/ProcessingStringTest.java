package com.samao.ocpjp.chapter07.processing.string.test;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hsamao on 11/3/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:coreJava-config.xml"})
public class ProcessingStringTest {

    @Before
    public void setUp () {
        System.out.println("setUP was called");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown was called");
    }
}
