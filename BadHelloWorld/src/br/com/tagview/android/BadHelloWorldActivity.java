package br.com.tagview.android;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class BadHelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        if (Locale.getDefault().getISO3Language().equals("pt-br")){
        	((TextView)findViewById(R.id.textview1)).setText("Péssimo, Péssimo, Olá Mundo");
        	((Button)findViewById(R.id.button1)).setText("Nova atividade");
        }else{
        	((TextView)findViewById(R.id.textview1)).setText("Bad, Bad, Hello World");
        	((Button)findViewById(R.id.button1)).setText("New activity");
        }
        
        ((Button)findViewById(R.id.button1)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent().setClassName(Activity2.class.getPackage().getName(), Activity2.class.getName()));
			}
		});
    }
}