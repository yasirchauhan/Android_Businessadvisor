package com.centangle.businessadvisor;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CategoriesAdapter extends ArrayAdapter<CategoryClass> {

	public CategoriesAdapter(Context context, ArrayList<CategoryClass> business) {
		super(context, 0, business);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// Get the data item for this position
		CategoryClass category = getItem(position);
		
		// Check if an existing view is being reused, otherwise inflate the view
		if (convertView == null) {
			convertView = LayoutInflater.from(getContext()).inflate(
					R.layout.categories_list_layout, parent, false);
		}
		
		// Lookup view for data population

		TextView category_list = (TextView) convertView
				.findViewById(R.id.category_list);
		// Populate the data into the template view using the data object

		category_list.setText(category.name);

		// Return the completed view to render on screen
		return convertView;
	}
}
