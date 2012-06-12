package com.Efrigerator.main;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EfrigeratorActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final MediaPlayer mpButtonClick = MediaPlayer.create(this, R.raw.button7);
        
        Button Fish = (Button) findViewById(R.id.fish);
        
        Fish.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
			 mpButtonClick.start();	
			}
		});
        
        
    }
}