package org.ejemplo;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by JAST on 16/01/2017.
 */

public class TestService extends IntentService {

    public final String TAG = "TestService";

    public TestService() {
        super("TestService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "Meow!");
    }
}
