package org.apache.dubbo.demo;

import org.apache.dubbo.demo.api.DemoService;
import org.apache.dubbo.demo.api.TimeoutTestService;
import org.apache.dubbo.demo.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cvictory ON 2018/11/29
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DemoService demoService;
    @Autowired
    private UserService userService;
    @Autowired
    private TimeoutTestService timeoutTestService;

    @RequestMapping("/demo")
    public String testDemo(){
        return demoService.sayHello("Dubbo Meetup");
    }

    @RequestMapping("/user")
    public String testUser(){
        return userService.getName("everyone!");
    }

    @RequestMapping("/timeout")
    public String testTimeout(){
        return timeoutTestService.getTime();
    }

    @RequestMapping("/error")
    public String error(){
        return "the error";
    }
}
