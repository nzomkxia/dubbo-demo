package org.apache.dubbo.demo.api;

import org.apache.dubbo.demo.model.Result;

/**
 * @author cvictory ON 2018/11/28
 */
public interface UserService {

    public Result getName(String uid);
}
