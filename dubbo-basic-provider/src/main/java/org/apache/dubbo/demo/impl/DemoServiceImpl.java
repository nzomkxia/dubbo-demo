package org.apache.dubbo.demo.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import org.apache.dubbo.common.Constants;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.apache.dubbo.demo.api.DemoService;
import org.apache.dubbo.demo.model.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component(value = "demoService")
public class DemoServiceImpl implements DemoService {

    public static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Value("${service.user.name}")
    private String name;

    @Override
    public Result sayHello(String localName) {
        logger.info("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext
                .getContext().getRemoteAddress());
        org.apache.dubbo.rpc.RpcContext.getContext().setAttachment(Constants.TAG_KEY, "gray");
        return new Result(name, "Hello " + localName + ", response from provider: " + RpcContext.getContext().getLocalAddress());
    }
}
