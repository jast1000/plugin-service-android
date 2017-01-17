package org.ejemplo.plugin;

import android.content.Intent;

import junit.framework.Test;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.ejemplo.TestService;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by JAST on 16/01/2017.
 */

public class TestPlugin extends CordovaPlugin {

    public final String EJECUTAR_SERVICIO = "ejecutarServicio";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            if(EJECUTAR_SERVICIO.equals(action)) {
                Intent testIntent = new Intent(cordova.getActivity(), TestService.class);
                cordova.getActivity().startService(testIntent);
                callbackContext.success();
                return true;
            }
            /*
            if (ACTION_ADD_CALENDAR_ENTRY.equals(action)) {
                JSONObject arg_object = args.getJSONObject(0);
                Intent calIntent = new Intent(Intent.ACTION_EDIT)
                        .setType("vnd.android.cursor.item/event")
                        .putExtra("beginTime", arg_object.getLong("startTimeMillis"))
                        .putExtra("endTime", arg_object.getLong("endTimeMillis"))
                        .putExtra("title", arg_object.getString("title"))
                        .putExtra("description", arg_object.getString("description"))
                        .putExtra("eventLocation", arg_object.getString("eventLocation"));

                this.cordova.getActivity().startActivity(calIntent);
                callbackContext.success();
                return true;
             */

            callbackContext.error("Invalid action");
            return false;
        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());
            callbackContext.error(e.getMessage());
            return false;
        }
    }
}
