package com.centangle.businessadvisor;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

public class BusinessAdapter extends ArrayAdapter<BusinessClass> {

	public BusinessAdapter(Context context, ArrayList<BusinessClass> business) {
		super(context, 0, business);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// Get the data item for this position
		BusinessClass business = getItem(position);

		// Check if an existing view is being reused, otherwise inflate the view
		if (convertView == null) {
			convertView = LayoutInflater.from(getContext()).inflate(
					R.layout.subcategory_list, parent, false);
		}//hellllo

		// Lookup view for data population
		TextView textView1 = (TextView) convertView
				.findViewById(R.id.textView);
		RatingBar MyRating = (RatingBar) convertView
				.findViewById(R.id.MyRating);
		// Populate the data into the template view using the data object
		textView1.setText(business.name);
		MyRating.setRating(business.rating);


		// Return the completed view to render on screen
		return convertView;
	}
}
