package com.samao.ocpjp;


import com.samao.ocpjp.chapter03.class_design.listing_3_1.Circle;
import com.samao.ocpjp.chapter03.class_design.listing_3_1.Overloaded;
import com.samao.ocpjp.chapter03.class_design.listing_3_1.TestNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hsamao on 10/29/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations = {"classpath:/coreJava-config.xml"})
public class DesignTester {

    @Autowired
    private Circle circle = new Circle(30,30, 40);

    @Autowired
    private Overloaded overloaded;

    @Autowired
    private TestNumber testNumber;


    @Before
    public void startUP () {
        System.out.println("startUP was called");
    }

    @After
    public void tearDown () {
        System.out.println("tearDown was called");
    }

    @Test
    public void circleTester (){
//        circle = new Circle();

        //circle.setCircle(20, 20, 10);
        //circle.toString();
        System.out.println(circle.toString());
        System.out.println("circleTester was called");
    }

    @Test
    public void overloadedTester () {
        overloaded.aMethod( 9, (long) 10);
    }

    @Test
    public void testNumberTester () {
        double sum = 0.0;
        Number [] numbers = new Number[4];


        numbers [0] = new Byte((byte)10);
        numbers [1] = new Integer(10);
        numbers [2] = new Float(10.0f);
        numbers [3] = new Double(10.0f);

        try {
            sum = testNumber.sum(numbers);
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();

            System.out.println("error");
        }

        System.out.println(sum);
    }


}
