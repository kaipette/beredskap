package com.javacodegeeks.android.phonecalltest;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	private Button callBtnBrann;
	private Button callBtnPoliti;
	private Button callBtnLege;
	private Button callBtnLiv;
	private Button callBtnKai;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		callBtnBrann = (Button) findViewById(R.id.callBrann);
		callBtnPoliti= (Button) findViewById(R.id.callPoliti);
		callBtnLege = (Button) findViewById(R.id.callLege);
		callBtnLiv = (Button) findViewById(R.id.callLiv);
		callBtnKai = (Button) findViewById(R.id.callKai);
				
		callBtnBrann.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					String uri = "tel:110";
					Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
					startActivity(callIntent);
				}catch(Exception e) {
					Toast.makeText(getApplicationContext(),"Your call has failed...", Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}
			}
		});

		callBtnPoliti.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					String uri = "tel:112";
					Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
					startActivity(callIntent);
				}catch(Exception e) {
					Toast.makeText(getApplicationContext(),"Your call has failed...", Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}
			}
		});

		callBtnLege.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					String uri = "tel:113";
					Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
					startActivity(callIntent);
				}catch(Exception e) {
					Toast.makeText(getApplicationContext(),"Your call has failed...", Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}
			}
		});

		callBtnLiv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					String uri = "tel:91626288";
					Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
					startActivity(callIntent);
				}catch(Exception e) {
					Toast.makeText(getApplicationContext(),"Your call has failed...", Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}
			}
		});

		callBtnKai.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					String uri = "tel:90050015";
					Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
					startActivity(callIntent);
				}catch(Exception e) {
					Toast.makeText(getApplicationContext(),"Your call has failed...", Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}
			}
		});

		Button button = (Button) findViewById(R.id.webViewBtn);

		button.setOnClickListener(new View.OnClickListener() {

			@Override

			public void onClick(View v) {

				goToSecondActivity();

			}

		});

	}
	private void goToSecondActivity() {

		Intent intent = new Intent(this, SecondActivityActivity.class);

		startActivity(intent);

	}


}
