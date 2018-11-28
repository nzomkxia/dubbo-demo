package org.apache.dubbo.demo.impl;


import com.alibaba.dubbo.rpc.RpcContext;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.apache.dubbo.demo.api.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cvictory ON 2018/11/28
 */
public class UserServiceImpl implements UserService {

    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public String getName(String uid) {
        logger.info("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + uid + ", request from consumer: " + RpcContext
                .getContext().getRemoteAddress());
        return "hello, " + uid;
    }
}
