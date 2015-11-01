package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class LoggerSingletonDoubleCheck {

    public static LoggerSingletonDoubleCheck myInstance;

    private LoggerSingletonDoubleCheck() {

    }

    public static LoggerSingletonDoubleCheck getMyInstance() {
        if (myInstance == null) {
            synchronized (LoggerSingletonDoubleCheck.class) {
                if (myInstance == null) {
                    myInstance = new LoggerSingletonDoubleCheck();
                }
            }

        }
        return myInstance;
    }

    public void log(String string) {
        //log implementation
        System.err.println(string);
    }

}
