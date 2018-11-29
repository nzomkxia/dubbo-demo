package org.apache.dubbo.demo.impl;

import org.apache.dubbo.demo.api.TimeoutTestService;

/**
 * @author cvictory ON 2018/11/29
 */
public class TimeoutTestServiceImpl implements TimeoutTestService {
    @Override
    public String getTime() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        return "Hello , sleep 2 seconds at time:" + System.currentTimeMillis() ;
    }
}
