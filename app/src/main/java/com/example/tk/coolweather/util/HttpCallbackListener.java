package com.example.tk.coolweather.util;

/**
 * Created by User on 2017/10/30.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
