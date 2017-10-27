package com.echonox;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class Splash extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        try {
            if ("echonox-splash".equals(action)) {
               cordova.getActivity().runOnUiThread(new Runnable() {
                    public void run() {
                        cordova.getActivity().getWindow().getDecorView().setBackground(null);
                    }
                });
                return true;
            }
            return false;
        } catch(Exception e) {
            callbackContext.error(e.getMessage());
            return false;
        }
    }
}
