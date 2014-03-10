package net.yuji2015.listytasky001;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	
	Button myButton1_0;
	Button myButton1_1;
	Button myButton1_2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Parse.initialize(this, "iqMoT5si8mZveTkHZgPRI7b0qp5Ferqmct0x5zjh", "ZwxS5TgnD928PoEBZ9CsSpv4c6Ez8ILoTWQR0UYA");
		super.onCreate(savedInstanceState);
		LayoutInflater inflater =  getLayoutInflater();
		setContentView(R.layout.activity_main);
		
//		ParseObject testObject = new ParseObject("TestObject");
//		testObject.put("foo", "bar");
//		testObject.saveInBackground();
		
		myButton1_0 = (Button)findViewById(R.id.button1_0);
		myButton1_1 = (Button)findViewById(R.id.button1_1);
		myButton1_2 = (Button)findViewById(R.id.button1_2);
		
		myButton1_0.setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Log.v("MainActivity","button1_0 was clicked");
						Intent i = new Intent(MainActivity.this, Activity_2_0.class);
						startActivity(i);
					}
				}
				);
		
		myButton1_1.setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Log.v("MainActivity","button1_1 was clicked");
						Intent i = new Intent(MainActivity.this, Activity_2_1.class);
						startActivity(i);
					}
				}
				);
		
		myButton1_2.setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Log.v("MainActivity","button1_2 was clicked");
						Intent i = new Intent(MainActivity.this, Activity_2_2.class);
						startActivity(i);
					}
				}
				);	
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}

//public boolean onCreateOptionsMenu(Menu menu) {
//	// Inflate the menu; this adds items to the action bar if it is present.
//	getMenuInflater().inflate(R.menu.main, menu);
//	return true;
//}
