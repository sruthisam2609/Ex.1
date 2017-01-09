package com.example.sample;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
public class SecondActivity extends Activity
{
	TextView result;
	
protected void onCreate(Bundle  savedInstanceState)
{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.second_activity);
	result=(TextView)findViewById(R.id.text3);
	result.setText("Test");
	 Typeface custom_font=Typeface.createFromAsset(getAssets(), "AlexBrush-Regular.ttf");
	Intent i=getIntent();
	String data_main= i.getStringExtra("username");
	result.setTypeface(custom_font);
	result.setText(data_main);
}
}
