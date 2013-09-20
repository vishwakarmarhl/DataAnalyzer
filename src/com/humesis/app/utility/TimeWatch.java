/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humesis.app.utility;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author vishwaka
 */
public class TimeWatch {

    long starts;

    public static TimeWatch start() {
        return new TimeWatch();
    }

    private TimeWatch() {
        reset();
    }

    public TimeWatch reset() {
        starts = System.currentTimeMillis();
        return this;
    }

    public long time() {
        long ends = System.currentTimeMillis();
        return ends - starts;
    }

    public long time(TimeUnit unit) {
        return unit.convert(time(), TimeUnit.MILLISECONDS);
    }
}