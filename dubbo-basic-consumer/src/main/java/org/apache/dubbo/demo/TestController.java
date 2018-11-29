package org.apache.dubbo.demo;

import org.apache.dubbo.demo.api.DemoService;
import org.apache.dubbo.demo.api.NoResponseService;
import org.apache.dubbo.demo.api.TimeoutTestService;
import org.apache.dubbo.demo.api.UserService;
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

    @RequestMapping("/demo")
    public ModelAndView testDemo() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("msg", demoService.sayHello("Dubbo Meetup"));
        return modelAndView;
    }

    @RequestMapping("/user")
    public ModelAndView testUser() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("msg", userService.getName("everyone!"));
        return modelAndView;
    }

    @RequestMapping("/timeout")
    public ModelAndView testTimeout() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("msg", timeoutTestService.getTime());
        return modelAndView;
    }

    @RequestMapping("/noresponse")
    public ModelAndView testNoResponse() {
        ModelAndView modelAndView = new ModelAndView("index");
        try {
            noResponseService.getResponse();
        } catch (Exception ex) {
            modelAndView.addObject("msg", "ex.getMessage()");
            return modelAndView;
        }
        modelAndView.addObject("msg", "No Response.");
        return modelAndView;
    }

    @RequestMapping("/error")
    public String error() {
        return "the error";
    }
}
