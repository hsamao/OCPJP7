package com.samao.ocpjp.chapter06.generics.and.collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Vector;

/**
 * Created by hsamao on 11/2/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:coreJava-config.xml"})
public class GenericsAndCollectoinsTester {

    @Autowired
    private OldContainerTest oldContainerTest;

    @Before
    public void setUP (){
        System.out.println("setUp was called");
    }

    @After
    public void tearDown (){
        System.out.println("tearDown was called");
    }

    @Test
    public void oldContainerTest() throws Exception{
        Vector floatValue = new Vector();
        floatValue.add(10.0f);
        floatValue.add(100.0);
        try {
            Float floatTemp = (Float) floatValue.get(1);
            System.out.println(floatTemp);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println(floatValue);

        }

    }
}
