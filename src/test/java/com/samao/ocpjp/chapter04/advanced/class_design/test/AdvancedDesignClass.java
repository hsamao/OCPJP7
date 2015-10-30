package com.samao.ocpjp.chapter04.advanced.class_design.test;

import com.samao.ocpjp.chapter04.advanced.class_design.Counter;
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

    /*@Autowired
    private Counter counter;*/

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

        double side = 4;

        double result = rectangular.getArea(side);

        rectangular.description();
        System.out.println(result);

    }

    @Test
    public void counterTester (){
        Counter counter = new Counter();
        counter.numberOfInstances();

        Counter anotherCounter = new Counter();
        anotherCounter.numberOfInstances();
    }

}
