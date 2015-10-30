package com.samao.ocpjp.chapter03.class_design.test;


import com.samao.ocpjp.chapter03.class_design.*;
import junit.framework.TestCase;
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
@ContextConfiguration(locations = {"classpath:/coreJava-config.xml"})
public class DesignTester extends TestCase {


    @Autowired
    private Circle circle;

    @Autowired
    private Overloaded overloaded;

    @Autowired
    private TestNumber testNumber;

    @Autowired
    private Square square;

//    @Autowired
//    private Point pointA;

    @Autowired
    private Point3D point3D;

    @Autowired
    private DownCast downCast;

    @Autowired
    private HappyBirthday happyBirthday;

    @Autowired
    private Overload overload;


    @Before
    public void setUp() throws Exception {
        point3D = new Point3D(10, 20, 30);
        System.out.println("startUP was called");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown was called");
    }

    @Test
    public void circleTester() {
        double area;

        circle.setRadius(4);
        area = circle.area();
        System.out.println("circle area is : " + area);
    }

    @Test
    public void squareTester() {
        square.setSide(10);
        System.out.println(square.area());
    }

//    @Test
//    public void pointTester() throws Exception {
//
//        Point pointB = new Point(10, 20);
//
//        if (pointA.equals(pointB) == true) {
//
//            System.out.println("pointA equals pointB");
//        } else {
//            System.out.println("pointA doesn't equal pointB");
//        }
//
//        assertEquals(10, pointA.getxPos());
//        assertEquals(20, pointA.getyPos());
//        System.out.println(pointA.toString());
//    }

    @Test
    public void point3DTester() {
        System.out.println(point3D.toString());
    }

    @Test
    public void downCastTester() throws Exception {

        Integer number = new Integer(5);

        try {
            Object object = downCast.getObject(number);
            String string = downCast.getString(object);
            System.out.println(string);

        } catch (Exception ex) {

            String errorMessage = ex.getMessage();
            System.out.println(errorMessage);
        }

    }

    @Test
    public void happyBirthdayTester(){
        happyBirthday.wish();
        happyBirthday.wish("Hussein Samao");
    }

    @Test
    public void overloadTester(){
        int val = 9;
        Integer val2 = 7;

        overload.aMethod(val);
        overload.aMethod(9);
        overload.aMethod(val2);
        overload.aMethod("nine");
    }

    @Test
    public void overloadedTester() {
        overloaded.aMethod(9, (long) 10);
    }

    @Test
    public void testNumberTester() {
        double sum = 0.0;
        Number[] numbers = new Number[4];


        numbers[0] = new Byte((byte) 10);
        numbers[1] = new Integer(10);
        numbers[2] = new Float(10.0f);
        numbers[3] = new Double(10.0f);

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
