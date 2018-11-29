package org.apache.dubbo.demo.impl;

import org.apache.dubbo.demo.api.NoResponseService;

/**
 * @author cvictory ON 2018/11/29
 */
public class NoResponseServiceImpl implements NoResponseService {
    @Override
    public String getResponse() {
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "I have response";
    }
}
