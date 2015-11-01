package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class LoggerDemandHolder {

    public static LoggerDemandHolder myInstance;

    private LoggerDemandHolder() {

    }

    public static class LoggerHolder {
        public static LoggerDemandHolder loggerDemandHolder = new LoggerDemandHolder();
    }

    public static LoggerDemandHolder getMyInstance() {
        return LoggerHolder.loggerDemandHolder;
    }

    public void log(String string) {
        //log implementation
        System.err.println(string);
    }

}
