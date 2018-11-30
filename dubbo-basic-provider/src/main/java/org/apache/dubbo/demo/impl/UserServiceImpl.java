package org.apache.dubbo.demo.impl;


import com.alibaba.dubbo.rpc.RpcContext;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.apache.dubbo.demo.api.UserService;
import org.apache.dubbo.demo.model.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cvictory ON 2018/11/28
 */
@Component(value = "userService")
public class UserServiceImpl implements UserService {

    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Value("${service.user.name}")
    private String name;

    @Override
    public Result getName(String uid) {
        logger.info("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + uid + ", request from consumer: " + RpcContext
                .getContext().getRemoteAddress());
        return new Result(name, "Hello " + uid + " , response from provider: " + RpcContext.getContext().getLocalAddress());
    }
}
