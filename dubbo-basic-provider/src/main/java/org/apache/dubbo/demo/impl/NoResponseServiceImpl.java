package org.apache.dubbo.demo.impl;

import org.apache.dubbo.demo.api.NoResponseService;
import org.apache.dubbo.demo.model.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author cvictory ON 2018/11/29
 */
@Component(value = "noResponseService")
public class NoResponseServiceImpl implements NoResponseService {

    @Value("${service.user.name}")
    private String name;

    @Override
    public Result getResponse() {
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Result(name, "I have response");
    }
}
