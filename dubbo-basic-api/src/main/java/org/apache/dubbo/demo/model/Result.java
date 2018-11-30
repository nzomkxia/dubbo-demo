package org.apache.dubbo.demo.model;

import java.io.Serializable;

/**
 * @author cvictory ON 2018/11/30
 */
public class Result implements Serializable {

    public Result(){

    }

    public Result(String userName, String msg){
        this.msg = msg;
        this.userName = userName;
    }

    private String userName;
    private String msg;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
