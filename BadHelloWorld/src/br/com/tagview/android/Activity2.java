package br.com.tagview.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		int j = 0;
		for (int i = 0; i < 1000000000; i++) {
			j += i;
		}
		Toast.makeText(this, "sleep " + String.valueOf(j), Toast.LENGTH_SHORT).show();

	}
}
