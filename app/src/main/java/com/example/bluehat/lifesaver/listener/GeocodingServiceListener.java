
package com.example.bluehat.lifesaver.listener;

import com.example.bluehat.lifesaver.data.LocationResult;

public interface GeocodingServiceListener {
    void geocodeSuccess(LocationResult location);

    void geocodeFailure(Exception exception);
}
