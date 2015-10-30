package com.samao.ocpjp.chapter04.advanced.class_design.test;

import com.samao.ocpjp.chapter04.advanced.class_design.Rectangular;
import com.samao.ocpjp.chapter04.advanced.class_design.Shape;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hsamao on 10/30/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations = "classpath:/coreJava-config.xml")
public class AdvancedDesignClass extends TestCase {


    @Autowired
    private Rectangular rectangular;

    @Before
    public void setUp (){
        System.out.println("setUp was called");
    }

    @After
    public void tearDown (){
        System.out.println("tearDown was called");
    }

    @Test
    public void rectangularTester () {

        Shape rect = new Rectangular();

        double side = 4;

        double result = rect.getArea(side);

        rect.description();
        System.out.println(result);

    }

}
