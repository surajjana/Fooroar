package com.fooroar.fooroar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class LandingPage extends Activity{
	
	
	Button login,signup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		/*getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();*/
		
		setContentView(R.layout.landing_page);
		
		init();
		
		login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getBaseContext(), Login.class);
				startActivity(i);
				finish();
			}
		});
		
		signup.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getBaseContext(), Signup.class);
				startActivity(i);
				finish();
			}
		});
		
	}

	private void init() {
		// TODO Auto-generated method stub
		login = (Button)findViewById(R.id.login_btn);
		signup = (Button)findViewById(R.id.signup_btn);
	}
	
	

	
	
}
