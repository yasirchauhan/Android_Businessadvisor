package com.centangle.businessadvisor;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class BusinessList extends Activity implements OnItemClickListener {

	private ListView business_list;
	private ListView category_list;
	private String[] categories;
	private DrawerLayout drawerLayout;
	private ActionBarDrawerToggle drawerlistener;
	private BusinessAdapter business_adapter;
	private ArrayList<CategoryClass> arrayofcategories;

	public  String business_name;
	public int business_rating;
	private int id;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.business_list);
		

		// Construct the data source
		ArrayList<BusinessClass> arrayOfbusinesses = new ArrayList<BusinessClass>();
		// Create the adapter to convert the array to views
		business_adapter = new BusinessAdapter(this, arrayOfbusinesses);
		business_list = (ListView) findViewById(R.id.home_screen_listview);
		business_list.setAdapter(business_adapter);
		business_list.setOnItemClickListener(this);
		business_adapter.clear();
		business_list.setSelection(1);
		BusinessClass restaurants = new BusinessClass((int) id,"Monal","http://...com", 4);
		business_adapter.add(restaurants);
		restaurants = new BusinessClass((int) id,"Tehzeeb", "http://...com", 5);
		business_adapter.add(restaurants);
		restaurants = new BusinessClass((int) id,"Red Onion", "http://...com", 3);
		business_adapter.add(restaurants);
		restaurants = new BusinessClass((int) id,"Habibi", "http://...com", 2);
		business_adapter.add(restaurants);
		restaurants = new BusinessClass((int) id,"Tandoori", "http://...com", 2);
		business_adapter.add(restaurants);
		restaurants = new BusinessClass((int) id,"Tandoori", "http://...com", 2);
		business_adapter.add(restaurants);
		restaurants = new BusinessClass((int) id,"Tandoori", "http://...com", 2);
		business_adapter.add(restaurants);
		restaurants = new BusinessClass((int) id,"Tehzeeb", "http://...com", 5);
		business_adapter.add(restaurants);
		restaurants = new BusinessClass((int) id,"Red Onion", "http://...com", 3);
		business_adapter.add(restaurants);
		restaurants = new BusinessClass((int) id,"Habibi", "http://...com", 2);
		business_adapter.add(restaurants);
		restaurants = new BusinessClass((int) id,"Tandoori", "http://...com", 2);
		business_adapter.add(restaurants);
		restaurants = new BusinessClass((int) id,"Tandoori", "http://...com", 2);
		business_adapter.add(restaurants);
		restaurants = new BusinessClass((int) id,"Tandoori", "http://...com", 2);
		business_adapter.add(restaurants);
		
		// business_adapter.notifyDataSetChanged();
		// Attach the adapter to a ListView
		// array initialization
		// adapter.notifyDataSetChanged();
		// adapter.clear();
		// drawer adapter initialization
		drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

		arrayofcategories = new ArrayList<CategoryClass>();
		CategoriesAdapter categoryadapter = new CategoriesAdapter(this,
				arrayofcategories);
		category_list = (ListView) findViewById(R.id.drawerlist);
		category_list.setAdapter(categoryadapter);
		
		category_list.setOnItemClickListener(this);
		CategoryClass newcategory = new CategoryClass("Restaurants");
		categoryadapter.add(newcategory);
		newcategory = new CategoryClass("Shopping");
		categoryadapter.add(newcategory);
		newcategory = new CategoryClass("Fast Food");
		categoryadapter.add(newcategory);
		newcategory = new CategoryClass("Photoghraphy");
		categoryadapter.add(newcategory);
		newcategory = new CategoryClass("Real Estate");
		categoryadapter.add(newcategory);
		newcategory = new CategoryClass("Wedding halls");
		categoryadapter.add(newcategory);
		newcategory = new CategoryClass("Catering");
		categoryadapter.add(newcategory);
		newcategory = new CategoryClass("Beauty and Spa");
		categoryadapter.add(newcategory);
		
		

		drawerlistener = new ActionBarDrawerToggle(this, drawerLayout,
				R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {

		};
		drawerLayout.setDrawerListener(drawerlistener);
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
	
	
		business_list.setOnItemClickListener(new OnItemClickListener() {
	    @Override
	    public void onItemClick(AdapterView<?> a,View v, int position, long id) {
	    	
	    	
	    	Intent intent=new Intent(BusinessList.this,BusinessPageDetail.class);
	        Bundle b = new Bundle();
	        b.putInt("id", (int)id);
	        intent.putExtras(b);
	        startActivity(intent);
	    }
	});
	
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (drawerlistener.onOptionsItemSelected(item)) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		drawerlistener.onConfigurationChanged(newConfig);

		super.onConfigurationChanged(newConfig);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onPostCreate(savedInstanceState);
		drawerlistener.syncState();
	}

	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {

		switch (position) {
		case 0:
			business_adapter.clear();
			BusinessClass restaurants = new BusinessClass((int) id,"Monal","http://...com", 4);
			business_adapter.add(restaurants);
			restaurants = new BusinessClass((int) id,"Tehzeeb", "http://...com", 5);
			business_adapter.add(restaurants);
			restaurants = new BusinessClass((int) id,"Red Onion", "http://...com", 3);
			business_adapter.add(restaurants);
			restaurants = new BusinessClass((int) id,"Habibi", "http://...com", 2);
			business_adapter.add(restaurants);
			restaurants = new BusinessClass((int) id,"Tandoori", "http://...com", 2);
			business_adapter.add(restaurants);
			restaurants = new BusinessClass((int) id,"Tandoori", "http://...com", 2);
			business_adapter.add(restaurants);
			restaurants = new BusinessClass((int) id,"Tandoori", "http://...com", 2);
			business_adapter.add(restaurants);
			restaurants = new BusinessClass((int) id,"Tehzeeb", "http://...com", 5);
			business_adapter.add(restaurants);
			restaurants = new BusinessClass((int) id,"Red Onion", "http://...com", 3);
			business_adapter.add(restaurants);
			restaurants = new BusinessClass((int) id,"Habibi", "http://...com", 2);
			business_adapter.add(restaurants);
			restaurants = new BusinessClass((int) id,"Tandoori", "http://...com", 2);
			business_adapter.add(restaurants);
			restaurants = new BusinessClass((int) id,"Tandoori", "http://...com", 2);
			business_adapter.add(restaurants);
			restaurants = new BusinessClass((int) id,"Tandoori", "http://...com", 2);
			business_adapter.add(restaurants);


			break;
		case 1:
			business_adapter.clear();
			BusinessClass Shopping = new BusinessClass((int) id,"J.", "http://...com", 5);
			Shopping = new BusinessClass((int) id,"Bonanza", "http://...com", 2);
			business_adapter.add(Shopping);
			Shopping = new BusinessClass((int) id,"Outfitters", "http://...com", 2);
			business_adapter.add(Shopping);
			Shopping = new BusinessClass((int) id,"StoneAge", "http://...com", 1);
			business_adapter.add(Shopping);
			Shopping = new BusinessClass((int) id,"Khaadi", "http://...com", 2);
			business_adapter.add(Shopping);
			Shopping = new BusinessClass((int) id,"Khaadi", "http://...com", 2);
			business_adapter.add(Shopping);
			Shopping = new BusinessClass((int) id,"Khaadi", "http://...com", 2);
			business_adapter.add(Shopping);
			Shopping = new BusinessClass((int) id,"Khaadi", "http://...com", 2);
			business_adapter.add(Shopping);
			Shopping = new BusinessClass((int) id,"Outfitters", "http://...com", 2);
			business_adapter.add(Shopping);
			Shopping = new BusinessClass((int) id,"StoneAge", "http://...com", 1);
			business_adapter.add(Shopping);
			Shopping = new BusinessClass((int) id,"Khaadi", "http://...com", 2);
			business_adapter.add(Shopping);
			Shopping = new BusinessClass((int) id,"Khaadi", "http://...com", 2);
			business_adapter.add(Shopping);
			Shopping = new BusinessClass((int) id,"Khaadi", "http://...com", 2);
			business_adapter.add(Shopping);
			Shopping = new BusinessClass((int) id,"Khaadi", "http://...com", 2);
			business_adapter.add(Shopping);

			break;
		case 2:
			business_adapter.clear();
			BusinessClass fastfood = new BusinessClass((int) id,"J.", "http://...com", 4);
			fastfood = new BusinessClass((int) id,"KFC", "http://...com", 3);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"McDonald's", "http://...com", 3);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"Pizza Hut", "http://...com", 3);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"Foodos", "http://...com", 2);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"Foodos", "http://...com", 2);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"Foodos", "http://...com", 2);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"Foodos", "http://...com", 2);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"Foodos", "http://...com", 2);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"McDonald's", "http://...com", 3);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"Pizza Hut", "http://...com", 3);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"Foodos", "http://...com", 2);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"Foodos", "http://...com", 2);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"Foodos", "http://...com", 2);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"Foodos", "http://...com", 2);
			business_adapter.add(fastfood);
			fastfood = new BusinessClass((int) id,"Foodos", "http://...com", 2);
			business_adapter.add(fastfood);
			break;

		default:
			break;

		}
		drawerLayout.closeDrawers();
	}

}















/**	business_list.setOnItemClickListener(new OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> parent, View view,
		int position, long id) {

	
	
	
	Bundle b = new Bundle();
    // Storing data into bundle
    b.putString("businessname", business_name);
	b.putInt("businessrating", business_rating);
	// Creating Intent object
	Intent in = new Intent(BusinessList.this,BusinessPageDetail.class);
	// Storing bundle object into intent
	in.putExtras(b);
	startActivity(in);

}
});

}**/

