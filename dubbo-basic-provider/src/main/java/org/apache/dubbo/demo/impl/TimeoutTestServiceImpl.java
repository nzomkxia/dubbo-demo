package org.apache.dubbo.demo.impl;

import org.apache.dubbo.demo.api.TimeoutTestService;
import org.apache.dubbo.demo.model.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author cvictory ON 2018/11/29
 */
@Component(value = "timeoutTestService")
public class TimeoutTestServiceImpl implements TimeoutTestService {
    @Value("${service.user.name}")
    private String name;

    @Override
    public Result getTime() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
        }
        return new Result(name, "Hello, I am sleep 600 millisecond.");
    }
}
