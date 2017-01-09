package com.example.sample;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity
{

	Button bt;
    TextView txt;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button) findViewById(R.id.hello);
        txt=(TextView)findViewById(R.id.tv);
        ed1=(EditText)findViewById(R.id.editT);
        bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String data=ed1.getText().toString();
				//Toast msg=Toast.makeText(getApplicationContext(), data,Toast.LENGTH_LONG);
				// TODO Auto-generated method stub
				txt.setText("Hello"+data);
				Intent i=new Intent(MainActivity.this,SecondActivity.class);
				i.putExtra("username", data);
				startActivity(i);
			}
		});
    }

   
}
