package com.centangle.businessadvisor;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RatingBar;
import android.widget.TextView;

public class BusinessPageDetail extends Activity {

	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.business_page_layout);
        
		
	/**	@SuppressWarnings("unchecked")
		ArrayList<BusinessClass> business_detail = (ArrayList<BusinessClass>) getIntent().getSerializableExtra("mylist");
		Log.i("app",business_detail.toString());**/
		
		
		int value = getIntent().getIntExtra("id", 0);
		TextView tv=(TextView)findViewById(R.id.textView1);
		tv.setText(""+value);  
		
	}

}




















/**	// get the Intent that started this Activity
Intent in = getIntent();

// get the Bundle that stores the data of this Activity
Bundle b = in.getExtras();

// getting data from bundle
String business_name = b.getString("businessname");
int business_rating = b.getInt("businessrating");


 // show data to layout **/