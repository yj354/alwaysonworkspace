package net.yuji2015.imagevideo2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class OtherActivity extends Activity {
	
	ImageView image;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other_activity);
		
		
		image = (ImageView) this.findViewById(R.id.imageView1);
		image.setImageResource(R.drawable.image1);
	}

}
