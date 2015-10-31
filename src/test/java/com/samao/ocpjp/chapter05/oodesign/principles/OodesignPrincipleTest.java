package com.samao.ocpjp.chapter05.oodesign.principles;


import com.samao.ocpjp.chapter05.oodesign.principles.and.patterns.Circle;
import com.samao.ocpjp.chapter05.oodesign.principles.and.patterns.Rectangle;
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

    @Before
    public void setUp() {
        System.out.println("setUp was called");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown was called");
    }

    @Test
    public void setCircle() {
        circle = new Circle(10, 20, 30);
        System.out.println(circle.toString());
        circle.roll(30);
    }

    @Test
    public void setRectangle() {
        rectangle = new Rectangle(40, 20);
        System.out.printf(rectangle.toString());
        rectangle.rotate(30);
    }
}
