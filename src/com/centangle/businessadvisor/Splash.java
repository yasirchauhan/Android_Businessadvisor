package com.centangle.businessadvisor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle yasir) {
		// TODO Auto-generated method stub
		super.onCreate(yasir);
		setContentView(R.layout.splash);
		Thread timer = new Thread() {

			public void run() {
				try {
					sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();

				} finally {
					Intent openMainactivity = new Intent(
							"com.centangle.businessadvisor.MAINACTIVITY");
					startActivity(openMainactivity);
				}

			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}