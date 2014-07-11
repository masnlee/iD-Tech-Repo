package com.masonl.idtechproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	public int count = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final TextView text = (TextView) findViewById(R.id.textView1);
		
		Button button1 = (Button) findViewById(R.id.button1);
		
		Button button2 = (Button) findViewById(R.id.button2);
		
		Button button3 = (Button) findViewById(R.id.button3);
		
		Button button4 = (Button) findViewById(R.id.button4);
		
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				count=0;
				text.setText(count+"");
				
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				count--;
				text.setText(count+"");
				
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				count++;
				text.setText(count+"");
				
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				startActivity(intent);
				
			}
		});
	}

	
}
