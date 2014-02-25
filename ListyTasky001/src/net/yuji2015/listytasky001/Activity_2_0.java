package net.yuji2015.listytasky001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
//import android.widget.Button;

public class Activity_2_0 extends Activity implements OnClickListener {
	
	ImageView image;
	Button myButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_0);
		
		image = (ImageView) this.findViewById(R.id.imageView_2_0);
		image.setImageResource(R.drawable.layout20);
		
		
		myButton = (Button)findViewById(R.id.button2_1);
		myButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Log.v("Activity_2_0","button2_1 was clicked");
		
		Intent i = new Intent(this, Activity_2_0_1.class);
		startActivity(i);
		
	}

}
