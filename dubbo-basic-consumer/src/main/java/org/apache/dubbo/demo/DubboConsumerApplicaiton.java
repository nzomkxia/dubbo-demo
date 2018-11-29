package org.apache.dubbo.demo;

import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.apache.dubbo.demo.api.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("spring/dubbo-consumer.xml")
public class DubboConsumerApplicaiton {

    public static final Logger logger = LoggerFactory.getLogger(DubboConsumerApplicaiton.class);

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplicaiton.class, args);

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo-consumer.xml"});
//        context.start();
//        DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy
//
//        while (true) {
//            try {
//                Thread.sleep(2000);
//                String hello = demoService.sayHello("world"); // call remote method
//                logger.info(hello); //get result
//
//            } catch (Throwable throwable) {
//                throwable.printStackTrace();
//            }
//
//
//        }
    }
}
