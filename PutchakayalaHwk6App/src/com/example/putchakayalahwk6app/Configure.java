package com.example.putchakayalahwk6app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Configure extends Activity {
	
	private class ButtonHandler implements View.OnClickListener
	
	{
		public void onClick(View V)
		
		{ 
			handleButtonClick();
		
		}
	}
private void handleButtonClick()
{
	Intent data = new Intent();
	
	final EditText textEmailaddress = (EditText) findViewById(R.id.editText1);
	
	data.putExtra("input",textEmailaddress.getText().toString());
	
	setResult(Activity.RESULT_OK,data);
	
	finish();
	
}

public void onCreate(Bundle SavedInstanceState){
	
	super.onCreate(SavedInstanceState);
	setContentView(R.layout.configure);
	final Button Savesettings = (Button) findViewById(R.id.button1);
	Savesettings.setOnClickListener (new ButtonHandler());
	
	
			
	
	}
	
}
