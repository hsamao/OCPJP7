package com.samao.ocpjp.chapter07.processing.string.test;

import com.samao.ocpjp.chapter07.processing.string.Circle;
import com.samao.ocpjp.chapter07.processing.string.Regex7;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hsamao on 11/3/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:coreJava-config.xml"})
public class ProcessingStringTest {

    @Autowired
    private Regex7 regex7;

    @Autowired
    private Circle circle;

    @Before
    public void setUp () {
        System.out.println("setUP was called");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown was called");
    }

    @Test
    public void circleTester () throws Exception{
        try {
            circle = new Circle(10, 10, 5);
            circle.area();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void regex7Tester(){
        String ipStr1 = "255.245.188.123"; // valid IP address
        String ipStr2 = "255.245.188.273"; // invalid IP address - 273 is greater than 255

        regex7.validateIP(ipStr1);
        regex7.validateIP(ipStr2);
    }


}
