package com.fooroar.fooroar;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class ForgotPasswd extends Activity{
	
	//final ActionBar actionBar = getActionBar();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
		
		//actionBar.setDisplayShowTitleEnabled(true);
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#d50000")));
		bar.setTitle("Forgot Password");
		
		//actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.actionbar_bg));
		
		setContentView(R.layout.forgotpwd);
	}

	
}
