package com.gp.myfirstapp;

import com.testflightapp.lib.TestFlight;

import android.app.Application;

public class MyApp extends Application {
	private String YOUR_APP_TOKEN = "fe7e2cae-df7c-4aa1-a28d-1b96675487c9";
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		TestFlight.takeOff(this, YOUR_APP_TOKEN);
	}
}
