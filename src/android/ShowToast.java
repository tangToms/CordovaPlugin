package com.custom.toast;

import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class ShowToast extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if("showToast".equals(action)){
            Toast.makeText(cordova.getActivity(),"hello world !!!",Toast.LENGTH_LONG).show();
            callbackContext.success("success");
            return true;
        }
        callbackContext.error("error");
        return false;
    }
}
