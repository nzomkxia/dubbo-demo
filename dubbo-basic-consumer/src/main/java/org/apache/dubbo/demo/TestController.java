package org.apache.dubbo.demo;

import org.apache.dubbo.common.Constants;
import org.apache.dubbo.demo.api.DemoService;
import org.apache.dubbo.demo.api.NoResponse2Service;
import org.apache.dubbo.demo.api.NoResponseService;
import org.apache.dubbo.demo.api.TimeoutTestService;
import org.apache.dubbo.demo.api.UserService;
import org.apache.dubbo.demo.model.Result;
import org.apache.dubbo.rpc.RpcException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author cvictory ON 2018/11/29
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DemoService demoService;
    @Autowired
    private UserService userService;
    @Autowired
    private TimeoutTestService timeoutTestService;
    @Autowired
    private NoResponseService noResponseService;
    @Autowired
    private NoResponse2Service noResponse2Service;

    @RequestMapping("/demo")
    public ModelAndView testDemo() {
        ModelAndView modelAndView = new ModelAndView("index");
        org.apache.dubbo.rpc.RpcContext.getContext().setAttachment(Constants.TAG_KEY, "gray");
        modelAndView.addObject("result", demoService.sayHello("Dubbo Meetup"));
        return modelAndView;
    }

    @RequestMapping("/user")
    public ModelAndView testUser() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("result", userService.getName("everyone!"));
        return modelAndView;
    }

    @RequestMapping("/timeout")
    public ModelAndView testTimeout() {
        ModelAndView modelAndView = new ModelAndView("retry");
        try {
            modelAndView.addObject("result", timeoutTestService.getTime());
        } catch (RpcException ex){
            modelAndView.addObject("result", new Result("Test For Timeout.", ex.getMessage()));
            return modelAndView;
        }
        return modelAndView;
    }

    @RequestMapping("/retry")
    public ModelAndView testNoResponse() {
        ModelAndView modelAndView = new ModelAndView("retry");
        try {
            noResponseService.getResponse();
        } catch (Exception ex) {
            modelAndView.addObject("result", new Result("Test For Retry 1.", ex.getMessage()));
            return modelAndView;
        }
        modelAndView.addObject("result", new Result("Test For Retry 1.", "No Response."));
        return modelAndView;
    }

    @RequestMapping("/retry2")
    public ModelAndView testNoResponse2() {
        ModelAndView modelAndView = new ModelAndView("retry");
        try {
            noResponse2Service.getResponse();
        } catch (Exception ex) {
            modelAndView.addObject("result", new Result("Test For Retry 2.", ex.getMessage()));
            return modelAndView;
        }
        modelAndView.addObject("result", new Result("Test For Retry 2.", "No Response."));
        return modelAndView;
    }

    @RequestMapping("/error")
    public String error() {
        return "the error";
    }
}
