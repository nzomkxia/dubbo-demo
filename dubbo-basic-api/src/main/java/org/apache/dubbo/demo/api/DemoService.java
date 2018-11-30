package org.apache.dubbo.demo.api;


import org.apache.dubbo.demo.model.Result;

/**
 * @author zmx ON 2018/10/30
 */
public interface DemoService {

    Result sayHello(String name);
}
