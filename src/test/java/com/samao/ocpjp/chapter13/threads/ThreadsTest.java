package com.samao.ocpjp.chapter13.threads;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hsamao on 11/11/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:coreJava-config.xml"})
public class ThreadsTest {

    @Autowired
    MyThread1 myThread1;

    @Autowired
    MyThread2 myThread2;

    @Autowired
    TimeBomb timeBomb;

    @Before
    public void setUP() {
        System.out.println("Setup was called");
    }

    @After
    public void tearDown() {
        System.out.println("TearDown was called");
    }

    @Test
    public void timeBombTester(){
        System.out.println("Starting 10 second count down. . . ");
        timeBomb.start();
        System.out.println("Boom!!!");
    }

    @Test
    public void myThread2Tester() {
        Thread myThread2 = new Thread(new MyThread2());
        myThread2.start();
        System.out.println("In main method; thread name is : " + Thread.currentThread().getName());
    }

    @Test
    public void myThread1Tester() {

        myThread1.start();
        System.out.println("In main thread, thread name is " + Thread.currentThread().getName());
    }
}
