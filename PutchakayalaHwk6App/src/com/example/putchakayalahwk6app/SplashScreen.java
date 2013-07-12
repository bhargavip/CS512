package com.example.putchakayalahwk6app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		
		Handler h = new Handler();
		h.postDelayed(new HomeScreenActivator(), 5000);
	}

	
	class HomeScreenActivator implements Runnable {
		public void run() {
		// fire up the HomeScreen activity
		startActivity(new Intent( getApplication(), HomeScreen.class) );
		finish();
		
		
		
	 
	// @Override
	//public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.splash_screen, menu);
		//return true;
	}
	}
}
