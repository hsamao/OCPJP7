package com.samao.ocpjp.chapter04.advanced.class_design.test;

import com.samao.ocpjp.chapter04.advanced.class_design.*;
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
@ContextConfiguration(locations = "classpath:/coreJava-config.xml")
public class AdvancedDesignClass extends TestCase {

    @Autowired
    private Counter counter;

    @Autowired
    private Shape shape;

    @Autowired
    private Rectangular rectangular;

    @Autowired
    private Circle circle;

    @Autowired
    private StatusReporter statusReporter;

    @Autowired
    private EnumTest enumTest;

    @Before
    public void setUp() {
        System.out.println("setUp was called");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown was called");
    }

    @Test
    public void setEnumTest() {
        enumTest = new EnumTest(PrinterType.LASER);
        enumTest.feature();
    }

    @Test
    public void statusReporterTester() {
        Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(230, 99, 26));
        System.out.println(descriptiveColor);
    }


    @Test
    public void circleTester() {
        circle = new Circle(5, 4, 9);

        System.out.println(circle.toString());
    }

    @Test
    public void shapeTester() {
        Shape.Color white = new Shape.Color(255, 255, 255);

        System.out.println("White color has values: " + white);

    }

    @Test
    public void rectangularTester() {

        double side = 4;

        double result = rectangular.getArea(side);

        rectangular.description();
        System.out.println(result);

    }

    @Test
    public void counterTester() {
        counter.numberOfInstances();

        Counter counter = new Counter();
        counter.numberOfInstances();

        Counter anotherCounter = new Counter();
        anotherCounter.numberOfInstances();

    }


}
