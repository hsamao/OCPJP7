package com.samao.ocpjp.chapter06.generics.and.collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by hsamao on 11/2/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:coreJava-config.xml"})
public class GenericsAndCollectoinsTester {

    @Autowired
    private OldContainerTest oldContainerTest;

    @Autowired
    private BoxPrinter boxPrinter;

    @Autowired
    private BoxPrinterGeneric boxPrinterGeneric;

    @Autowired
    private Pair<Integer, String> worldCup;

    @Autowired
    private PairOfT pairOfTNames;

    @Before
    public void setUP() {
        System.out.println("setUp was called");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown was called");
    }

    @Test
    public void pairOfTTester(){
        pairOfTNames = new PairOfT<String>("Hussein", "Samao");
        System.out.println(pairOfTNames.getValue1() + " " + pairOfTNames.getValue2());

        PairOfT worldCup = new PairOfT<String>("2014", "Brazil");
        System.out.println(worldCup.getValue1() + " " + worldCup.getValue2());
    }

    @Test
    public void pairTester() {

        worldCup = new Pair  (2014, "Brazil");

        System.out.println(worldCup.getFirstValue() + " " + worldCup.getSecondValue());
       // System.out.println(worldCup);

    }

    @Test
    public void boxPrinterGerneric() throws Exception{
        boxPrinterGeneric = new BoxPrinterGeneric<Integer>(new Integer(10));
        System.out.println(boxPrinterGeneric);


        BoxPrinterGeneric <String> stringValue = new BoxPrinterGeneric<String>("Hello World");
        System.out.println(stringValue);
    }

    @Test
    public void boxPrinterTester() throws Exception {
        boxPrinter = new BoxPrinter(10);
        System.out.println(boxPrinter);

        Integer intValue1 = (Integer) boxPrinter.getObject();
        System.out.println(intValue1);

        BoxPrinter stringValue = new BoxPrinter("Hi there");
        System.out.println(stringValue);

        try {
            Integer intValue2 = (Integer) stringValue.getObject();
            System.out.println(intValue2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(new BoxPrinter("Hello World"));
    }

    @Test
    public void oldContainerTest() throws Exception {
        Vector floatValue = new Vector();
        floatValue.add(10.0f);
        floatValue.add(100.0);
        try {
            Float floatTemp = (Float) floatValue.get(1);
            System.out.println(floatTemp);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println(floatValue);

        }

    }
}
