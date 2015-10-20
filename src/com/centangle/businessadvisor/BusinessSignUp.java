package com.centangle.businessadvisor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BusinessSignUp extends Activity {

	EditText business_email;
	EditText business_password;
	EditText UserName;
	Button business_signup;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.business_signup_screen);
		addListenerOnButton();
	}

	private void addListenerOnButton() {

		final Context context = this;
		business_email = (EditText) findViewById(R.id.business_email);
		business_password = (EditText) findViewById(R.id.business_password);
		UserName = (EditText) findViewById(R.id.UserName);
		business_signup = (Button) findViewById(R.id.business_signup);
		business_signup.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				// Starting a new Intent
				final String email = business_email.getText().toString();
				final String user = UserName.getText().toString();
				final String pass = business_password.getText().toString();
				if (!isValidEmail(email)) {
					business_email.setError("Enter valid Email");
				}

				else if (!isValidPassword(pass)) {
					business_password.setError("Enter valid Password");
				} else if (!isValidUser(user)) {
					UserName.setError("Enter valid Username");
				} else {
					Intent intent = new Intent(context, BusinessList.class);
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

	private boolean isValidUser(String user) {
		String USER_PATTERN = "^[a-z0-9_-]{3,15}$";

		Pattern pattern = Pattern.compile(USER_PATTERN);
		Matcher matcher = pattern.matcher(user);
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
