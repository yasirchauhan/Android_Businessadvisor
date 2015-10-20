package com.centangle.businessadvisor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BusinessSignIn extends Activity {

	Button Business_advisor;
	EditText business_advisor_email;
	EditText business_advisor_password;
	Button businessadvisor_signin_button;
	TextView sign_up_textview;
	ProgressDialog prgDialog;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.business_signin_screen);
		addListenerOnButton();
		

		sign_up_textview = (TextView) findViewById(R.id.sign_up_textview);
		sign_up_textview = (TextView) findViewById(R.id.sign_up_textview);
		prgDialog = new ProgressDialog(this);
		 prgDialog.setMessage("Please wait...");
		 prgDialog.setCancelable(false);

		sign_up_textview.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				// Starting a new Intent
				Intent intent = new Intent(getBaseContext(), BusinessSignUp.class);
				startActivity(intent);
			}
		});

	}

	private void addListenerOnButton() {

		final Context context = this;
		business_advisor_email = (EditText) findViewById(R.id.businessadvisor_email);
		business_advisor_password = (EditText) findViewById(R.id.businessadvisor_password);
		businessadvisor_signin_button = (Button) findViewById(R.id.businessadvisor_signin_button);
		businessadvisor_signin_button
				.setOnClickListener(new View.OnClickListener() {

					public void onClick(View arg0) {

						
						final String email = business_advisor_email.getText()
								.toString();
						final String pass = business_advisor_password.getText()
								.toString();
						if (!isValidEmail(email)) {
							business_advisor_email
									.setError("Enter valid Email");
						}

						else if (!isValidPassword(pass)) {
							business_advisor_password
									.setError("Enter valid Password");
						} else {
							// Starting a new Intent
							Intent intent = new Intent(context,
									BusinessList.class);
							startActivity(intent);
						}
					}
				});

	}

	// validating email id
	private boolean isValidEmail(String email) {
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	// validating password with retype password
	private boolean isValidPassword(String pass) {
		if (pass != null && pass.length() > 6) {
			return true;
		}
		return false;

	}

}
