package com.mycompany.myapp;
import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.media.*;

public class splashActivity extends Activity
{
	int SPLASH_TIME_OUT = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash);
		
		final MediaPlayer mp = MediaPlayer.create(splashActivity.this, R.raw.bg_music);
		mp.start();

		new Handler().postDelayed(new Runnable(){

				@Override
				public void run()
				{
					Intent intent = new Intent(splashActivity.this, MainActivity.class);
					startActivity(intent);
					finish();
				}


			}, SPLASH_TIME_OUT);
	}
	
}
