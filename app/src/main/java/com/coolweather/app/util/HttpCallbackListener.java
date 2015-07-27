package com.coolweather.app.util;

/**
 * Created by xgj on 2015/5/25.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}
