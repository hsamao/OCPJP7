package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class LoggerEnhancedMulitThreaded {

    public static LoggerEnhancedMulitThreaded myInstance;

    private LoggerEnhancedMulitThreaded() {

    }

    public static LoggerEnhancedMulitThreaded getMyInstance() {
        if (myInstance == null) {
            synchronized (LoggerEnhancedMulitThreaded.class) {
                myInstance = new LoggerEnhancedMulitThreaded();
            }
        }
        return myInstance;
    }

    public void log(String string) {
        //log implementation
        System.err.println(string);
    }
}
