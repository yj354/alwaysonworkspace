package net.yuji2015.week1helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	TextView myTextView;
	Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        myTextView = (TextView) findViewById(R.id.my_textView);
        myButton = (Button) findViewById(R.id.my_button);
       
        myButton.setOnClickListener(this);
        
//        myButton.setOnClickListener(
//        		new OnClickListener(){
//        			@Override
//        			public void onClick(View org0) {
//        				Log.v("MainActivity", "Button Clicked");
//                        myTextview.setText("Hey stop that!");
//        2ways second better				  myTextview.setText(R.string.hello_world); 
//        			}
//        		}
//        		);
        Intent i = new Intent(MainActivitiy.this,OtherActivity.class);
        StartActivitiy(i)
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View clickedView) {
		// TODO Auto-generated method stub
		myTextView.setText("Hello HEllo HELLo HELLO");
		
	}
    
}
