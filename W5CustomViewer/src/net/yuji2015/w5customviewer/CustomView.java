package net.yuji2015.w5customviewer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

	private Canvas canvas;

	public CustomView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public CustomView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
		
		@Override
		protected void onDraw(Canvas convas){
			Paint p = new Point();
		p.setColor(Color.BLUE);
			int myColor = Color.argb(0,0,255,0);
			p.setColor(myColor);
			
			canvas.drawLine(0,0,canvas.getWidth(),canvas.getHeight(),p);
		}
		
		}
	}

}
