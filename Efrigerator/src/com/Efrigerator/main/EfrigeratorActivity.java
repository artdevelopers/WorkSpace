package com.Efrigerator.main;

import com.Efrigerator.main.R.id;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EfrigeratorActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	
	MediaPlayer mpButtonClick; 
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);        
               
        Button Fish = (Button) findViewById(R.id.fish);
        Button Chicken  = (Button) findViewById(R.id.chicken);
        Button FrozenVeggi  = (Button) findViewById(R.id.frozenvegies);
        Button IceCreame  = (Button) findViewById(R.id.icecream);
        Button GoatMeat = (Button) findViewById(R.id.goatmeat);
                     
        Fish.setOnClickListener(this);
        Chicken.setOnClickListener(this);
        FrozenVeggi.setOnClickListener(this);
        IceCreame.setOnClickListener(this);
        GoatMeat.setOnClickListener(this);
                  
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
			
		 mpButtonClick = MediaPlayer.create(this, R.raw.button7); 
		 mpButtonClick.start();	
		 switch (v.getId()){
		 
		 case R.id.fish :
			 setContentView(R.layout.secondscreen);
			 startActivity (new Intent ("com.Efrigerator.fishScreen"));
			 break;
		case R.id.chicken :
			 setContentView(R.layout.secondscreen);
			 break;
		case R.id.frozenvegies :
			 setContentView(R.layout.secondscreen);
			 break;
		case R.id.goatmeat :
			 setContentView(R.layout.secondscreen);
			 break;
		case R.id.icecream :
			 setContentView(R.layout.secondscreen);
			 break;
		 }
		 
	}
    
   
	
    
}