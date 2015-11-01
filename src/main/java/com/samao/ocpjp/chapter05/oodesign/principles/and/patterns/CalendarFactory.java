package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * Created by hsamao on 11/1/15.
 */

@Component
public class CalendarFactory {

    private static Calendar calendar = Calendar.getInstance();

    public void getCalender() {

        System.out.println(calendar);
    }


}
