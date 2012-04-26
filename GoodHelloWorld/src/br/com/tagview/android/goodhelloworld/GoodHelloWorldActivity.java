package br.com.tagview.android.goodhelloworld;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GoodHelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //workaround to set pt language
        String languageToLoad  = "pt";
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();  
        config.locale = locale;        
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        
        setContentView(R.layout.main);
        
        ((Button)findViewById(R.id.buttonNewActivity)).setText(getResources().getString(R.string.newActivity));
        ((Button)findViewById(R.id.buttonNewActivity)).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent().setClassName(NewActivity.class.getPackage().getName(), NewActivity.class.getName()));
			}
		});
    }
}