package org.apache.dubbo.demo.api;

import org.apache.dubbo.demo.model.Result;
import org.apache.dubbo.demo.model.UserInfoDO;

/**
 * @author cvictory ON 2018/11/28
 */
public interface UserService {

    public Result getName(String uid);

    Result getUser(String name, UserInfoDO userInfoDO);
}
