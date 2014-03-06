package net.yuji2015.w6savestuff;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	
	EditText editText;
	Button button;
	
	SharedPreferences sp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText = (EditText) this.findViewById(R.id.editText1);
		button = (Button) this.findViewById(R.id.button1);
		
		button.setOnClickListener(this);
		
		sp = getSharedPreferences("thetext", MODE_PRIVATE);
		
		String previousEntry = sp.getString("firsttext", null);
		if(previousEntry !=null) {
			Toast.makeText(this, previousEntry, Toast.LENGTH_SHORT).show();
		}
		
	}
		
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(this, editText.getText(), Toast.LENGTH_SHORT).show();
		SharedPreferences.Editor spe = sp.edit();
		spe.putString("firsttext", editText.getText().toString());
		spe.commit();
		
	}

}
