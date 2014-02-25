package net.yuji2015.projectone;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;/////
import android.widget.Button;/////
import android.widget.TextView;/////
import android.util.Log;//22222logcat
import android.widget.Toast;//33333making toast

public class MainActivity extends Activity implements OnClickListener { /////
	
	TextView myTextView; /////
	Button myButton; /////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Log.v("MainActivity","onCreate Started");//22222logcat-for print info
        setContentView(R.layout.activity_main);
        
        myTextView = (TextView) findViewById(R.id.my_textView);//////
        myButton = (Button) findViewById(R.id.my_button);//////
        
        myButton.setOnClickListener(this);/////
        
        Log.v("MainActivity","onCreate Finished");//22222logcat-for print info
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) { /////
		// TODO Auto-generated method stub
		myTextView.setText("Clicked");
		
		Log.v("Clicker", "onClick Called" + myTextView.getText());//22222logcat-for print info
//		Log.v("Clicker", "onClick Called");//22222logcat
//		Log.v("Clicker", "Button Clicked");//22222logcat
		
		Toast toast = Toast.makeText(this, "Hi", Toast.LENGTH_SHORT);//33333making toast
		toast.show();//33333making toast
		
	}
    
}
