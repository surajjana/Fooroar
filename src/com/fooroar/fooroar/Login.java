package com.fooroar.fooroar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity{
	
	Button frgt_pwd,login;
	TextView email,pwd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		init();
		
		login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(email.getText().toString().equalsIgnoreCase("abc@fooroar.com")){
					Intent i = new Intent(getBaseContext(),Model.class);
					startActivity(i);
					finish();
				}else{
					Toast.makeText(getApplicationContext(), "Invalid creds!!", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		frgt_pwd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getBaseContext(),ForgotPasswd.class);
				startActivity(i);
				finish();
			}
			
		});
	}

	private void init() {
		// TODO Auto-generated method stub
		login = (Button)findViewById(R.id.btnLogin);
		frgt_pwd = (Button)findViewById(R.id.forgotpwd);
		email = (TextView)findViewById(R.id.email);
		pwd = (TextView)findViewById(R.id.pwd);
	}

	
	
}
