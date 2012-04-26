package br.com.tagview.android.goodhelloworld;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

public class NewActivity extends Activity {
	Context ctx;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ctx = this;
		new HardWork().execute();
	}
	
	private class HardWork extends AsyncTask<Object, Object, Object>{
		private final ProgressDialog dialog = new ProgressDialog(NewActivity.this);
		
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			this.dialog.setMessage("Calculando...");
		    this.dialog.show();
		}
		
		@Override
		protected Object doInBackground(Object... params) {
			int j = 0;
			for (int i = 0; i < 10000000; i++) {
				j += i;
			}
			return j;
		}
		
		@Override
		protected void onPostExecute(Object result) {
			super.onPostExecute(result);
			this.dialog.dismiss();
			Toast.makeText(NewActivity.this, "sleep " + String.valueOf(result), Toast.LENGTH_SHORT).show();
		}
	}
}
