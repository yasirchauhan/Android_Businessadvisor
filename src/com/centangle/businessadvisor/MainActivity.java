package com.centangle.businessadvisor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button login_as_business_advisor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_login_screen);
		addListenerOnButton();
	}

	private void addListenerOnButton() {

		final Context context = this;
		login_as_business_advisor = (Button) findViewById(R.id.login_business_advisor_button);
		login_as_business_advisor.setOnClickListener(new View.OnClickListener() {

					public void onClick(View arg0) {

						Intent intent = new Intent(context,
								BusinessSignIn.class);
						startActivity(intent);
					}

				});

	}
}