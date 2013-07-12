package com.example.putchakayalahwk6app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomeScreen extends Activity {
	
	private static final int CONFIGURE_PREFERENCE_REQUEST_CODE = 1;
	private static final int RETRIEVE_ASSIGNMENT_REQUEST_CODE = 2;
	private static final int MANAGE_ASSIGNMENTS_REQUEST_CODE = 3;
	
	
	private class ButtonHandler implements
	
	View.OnClickListener
	
	{
		public void onClick(View v)
		
		{
			handleButtonClick ();
			
		}
		}
	
	private void handleButtonClick()
	{
		
		startActivityForResult(new Intent (this,Configure.class),CONFIGURE_PREFERENCE_REQUEST_CODE);
		
		
		
	}
	
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.homescreen);
		
		final Button ConfigurePreferences = (Button)findViewById(R.id.btnconfig);
		
		ConfigurePreferences.setOnClickListener(new ButtonHandler());
		
		 



  final Button Manageassignments = (Button) findViewById(R.id.btnmanage);
	// assuming that the id of the button is assignments, by the XML layout
	Manageassignments.setOnClickListener( new Button.OnClickListener() {
	public void onClick(View v) {
	try {
	startActivityForResult(new Intent(v.getContext(), ManageAssignments.class),
	MANAGE_ASSIGNMENTS_REQUEST_CODE);
	} catch (Exception e) {
	}
	}
	} ) ;
	
	}
	
	
	
	
	
	
	protected void onActivityResult(int requestCode,int resultCode,Intent data)
	
	{
		switch(requestCode) {
			
			case CONFIGURE_PREFERENCE_REQUEST_CODE:
				
				break;
				
			case RETRIEVE_ASSIGNMENT_REQUEST_CODE:
			
			   break;
			   
			case MANAGE_ASSIGNMENTS_REQUEST_CODE:
			
			  break;
				
				
				
		
		//super.onActivityResult(requestCode, resultCode, data);
		
		//if(resultCode == Activity.RESULT_CANCELED)
			
			//Toast.makeText(this,"activity cancelled",Toast.LENGTH_SHORT).show();
		//else if (resultCode == Activity.RESULT_OK)
			
		//{
			// String input = data.getStringExtra("input");
		//	
			// Toast.makeText(this,"activity ok,input = "+input,Toast.LENGTH_SHORT).show();
			
			
			
		}
		
	
	}
	
}

	
	


	


