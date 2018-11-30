package org.apache.dubbo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("spring/dubbo-provider.xml")
public class DubboProviderApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DubboProviderApplication.class, args);
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo-provider.xml"});
//		context.start();
//
//		while (true) {
//			;
//		}

	}
}
