package com.fooroar.fooroar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends Activity{
	
	Button frgt_pwd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		init();
		
		frgt_pwd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getBaseContext(),ForgotPasswd.class);
				startActivity(i);
			}
			
		});
	}

	private void init() {
		// TODO Auto-generated method stub
		frgt_pwd = (Button)findViewById(R.id.forgotpwd);
	}

	
	
}
