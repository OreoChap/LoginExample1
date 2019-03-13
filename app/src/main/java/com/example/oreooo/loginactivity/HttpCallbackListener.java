package com.example.oreooo.loginactivity;

/**
 * @author Oreo https://github.com/OreoChap
 * @date 2019/3/13
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
