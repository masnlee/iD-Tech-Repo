package com.masonl.idtechfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	String input;
	int intInput;
	int fahrenheit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView text2 = (TextView) findViewById (R.id.textView2);
		
		final TextView text1 = (TextView) findViewById(R.id.textView1);		
		final EditText edit1 = (EditText) findViewById(R.id.editText1);	
		
		Button button1 = (Button) findViewById(R.id.button1);
		
		Button button2 = (Button) findViewById(R.id.button2);
		
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				startActivity(intent);
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				try{
					String input = edit1.getText().toString();
					System.out.println(input +"hello");
					intInput = Integer.parseInt(input);	
					
					
				} catch(NumberFormatException e){
					System.out.print(e);
				}
				fahrenheit = (int) ((intInput - 32) * 5/9);
				text1.setText(String.valueOf(fahrenheit));
				
			}
		});
	}
}
