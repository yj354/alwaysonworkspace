package net.yuji2015.listytasky001;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;


public class Activity_2_0_1 extends Activity {
	
	WebView webview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_0_1);
		
		webview = (WebView) this.findViewById(R.id.webViewFacebook);
		webview.loadUrl("http://facebook.com");
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
