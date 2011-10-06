package com.android.RebootReceiver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.util.Log;

public class RebootReceiver extends Activity {
	private static final String TAG = "RebootReceiver";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		reboot();
		this.finish();
    }
    
    private void reboot() {
    	Log.i(TAG, "reboot");
    	Intent reboot = new Intent(Intent.ACTION_REBOOT);
    	reboot.putExtra("type", "factory_reset_reboot");
    	sendBroadcast(reboot);
    }
}