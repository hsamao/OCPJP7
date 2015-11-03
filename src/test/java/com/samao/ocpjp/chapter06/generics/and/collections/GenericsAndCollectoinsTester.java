package com.samao.ocpjp.chapter06.generics.and.collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

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

    @Autowired
    private Utilities utilities;

    @Autowired
    private WildCardUse wildCardUse;

    @Autowired
    private BoundedWildcardUse boundedWildcardUse;

    @Autowired
    private Circle circle;

    @Autowired
    private SqlQueue sqlQueue;

    @Autowired
    private Student[]  students;

    @Before
    public void setUP() {
        System.out.println("setUp was called");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown was called");
    }

    @Test
    public void studentTester() {
        Student [] students = {new Student("011c", "Harrison", 3.4), new Student("014c", "Starr", 3.0), new Student("013c", "Bob", 2.3)};
        System.out.println("Before storing by student id ");
        System.out.println("Student-ID \t Name \t CGPA (for 4.0) ");
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new GPAComparator());

        System.out.println("After storing by student id ");
        System.out.println("Student-ID \t Name \t GPA (for 4.0) ");
        System.out.println(Arrays.toString(students));
    }

    @Test
    public void SqlQueueTester(){
        sqlQueue.addInQueue("Harrison");
        sqlQueue.addInQueue("McCartney");
        sqlQueue.addInQueue("Starr");
        sqlQueue.addInQueue("Lennon");

        sqlQueue.printQueue();
        sqlQueue.removeFront();
        sqlQueue.printQueue();
        sqlQueue.removeBack();
        sqlQueue.printQueue();
    }

    @Test
    public void circleTest(){
        Set<Circle> circleSet = new HashSet<>();
        circleSet.add(new Circle(10, 20, 5));
        System.out.println(circleSet.contains(new Circle(10, 20, 5)));
    }

    @Test
    public void boundedWildcardUseTester() {
        List<Integer> listOfInteger = new ArrayList<>();
        List<Double> listOfDouble = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listOfInteger.add( i);
            listOfDouble.add((double)(i * i));
        }

        System.out.println("The Integer list is : " + listOfInteger);
        System.out.println(boundedWildcardUse.printList(listOfInteger));

        System.out.println("The Double list is : " + listOfDouble);
        System.out.println(boundedWildcardUse.printList(listOfDouble));
    }

    @Test
    public void wildCardUseTester() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        wildCardUse.printList(integerList);

        List<String> stringList = new ArrayList<>();
        stringList.add("10");
        stringList.add("20");
        wildCardUse.printList(stringList);

    }

    @Test
    public void utilitiesTester() {

        List<Integer> integerArrayListlist = new ArrayList<>();
        integerArrayListlist.add(10);
        integerArrayListlist.add(20);
        System.out.println("The original list is " + integerArrayListlist);

        utilities.fill(integerArrayListlist, 100);
        System.out.println("The list after calling Utilities.fill() is :" + integerArrayListlist);
    }

    @Test
    public void pairOfTTester() {
        pairOfTNames = new PairOfT<String>("Hussein", "Samao");
        System.out.println(pairOfTNames.getValue1() + " " + pairOfTNames.getValue2());

        PairOfT worldCup = new PairOfT<String>("2014", "Brazil");
        System.out.println(worldCup.getValue1() + " " + worldCup.getValue2());
    }

    @Test
    public void pairTester() {

        worldCup = new Pair(2014, "Brazil");

        System.out.println(worldCup.getFirstValue() + " " + worldCup.getSecondValue());
        // System.out.println(worldCup);

    }

    @Test
    public void boxPrinterGerneric() throws Exception {
        boxPrinterGeneric = new BoxPrinterGeneric<Integer>(new Integer(10));
        System.out.println(boxPrinterGeneric);


        BoxPrinterGeneric<String> stringValue = new BoxPrinterGeneric<String>("Hello World");
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
