
package com.example.bluehat.lifesaver.data;

import org.json.JSONObject;

public interface JSONPopulator {
    void populate(JSONObject data);

    JSONObject toJSON();
}