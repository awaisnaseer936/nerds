
package com.example.bluehat.lifesaver.listener;

import com.example.bluehat.lifesaver.data.Channel;

public interface WeatherServiceListener {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
