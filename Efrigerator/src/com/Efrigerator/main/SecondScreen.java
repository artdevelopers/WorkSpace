package com.Efrigerator.main;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondScreen extends Activity  implements OnClickListener{

	MediaPlayer mpButtonClick; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondscreen);
		Button Add = (Button) findViewById(R.id.add);
		Add.setOnClickListener(this);
	
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		mpButtonClick = MediaPlayer.create(this, R.raw.button7); 
		mpButtonClick.start();	
		
	}
	
	
	

}
