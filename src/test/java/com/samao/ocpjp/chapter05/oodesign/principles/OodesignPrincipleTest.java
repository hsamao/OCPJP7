package com.samao.ocpjp.chapter05.oodesign.principles;


import com.samao.ocpjp.chapter05.oodesign.principles.and.patterns.*;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hsamao on 10/31/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/coreJava-config.xml"})
public class OodesignPrincipleTest extends TestCase {

    @Autowired
    private Circle circle;

    @Autowired
    private Rectangle rectangle;

    @Autowired
    private CircleCompsite circleCompsite;

    /*@Autowired
    private CircleDesignPattern circleDesignPattern;*/

    @Autowired
    private CircleEnhancedDesignPattern circleEnhancedDesignPattern;

    @Autowired
    private CanvasFactoryDesignPattern canvasFactoryDesignPattern;

    @Autowired
    private CalendarFactory calendarFactory;

    @Before
    public void setUp() {
        System.out.println("setUp was called");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown was called");
    }

    @Test
    public void calendarFactoryTester(){
        calendarFactory.getCalender();
    }

    @Test
    public void canvasFactoryDesignPatternTester() {
        canvasFactoryDesignPattern.addNewShape("circle");
        canvasFactoryDesignPattern.addNewShape("rectangle");

        canvasFactoryDesignPattern.redraw();

    }

    @Test
    public void CircleEnhancedDesignPatternTester () {
        circleEnhancedDesignPattern = new CircleEnhancedDesignPattern(10, 20, 30);
        System.out.println(circleEnhancedDesignPattern);

        circleEnhancedDesignPattern.addObserver(new Canvas());
        circleEnhancedDesignPattern.addObserver(new ShapeArchiver());

        circleEnhancedDesignPattern.setRadius(50);
        System.out.println(circleEnhancedDesignPattern);
    }

   /* @Test
    public void circleDesignPattern () {
        circleDesignPattern = new CircleDesignPattern(10, 20, 30);
        circleDesignPattern.setCanvas(new Canvas());
        circleDesignPattern.setShapeArchiver(new ShapeArchiver());

        System.out.println(circleDesignPattern);
    }*/

    @Test
    public void CircleCompositeTester () {
        circleCompsite = new CircleCompsite(10, 20, 30);

        System.out.println(circleCompsite);
    }
    @Test
    public void CircleTester() {
        circle = new Circle(10, 20, 30);
        System.out.println(circle);
        circle.roll(30);
    }

    @Test
    public void RectangleTester() {
        rectangle = new Rectangle(40, 20);
        System.out.println(rectangle);
        rectangle.rotate(30);
    }
}
