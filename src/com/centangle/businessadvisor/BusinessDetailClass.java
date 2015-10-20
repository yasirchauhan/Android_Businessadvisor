package com.centangle.businessadvisor;

public class BusinessDetailClass {

	public int id;
	public String phonenumber;
	public String name;
	public String image;
	public String address;
	public String reviews;
	public String rating;

	public BusinessDetailClass(int id, String name, String image,
			String rating, String address, String reviews, String phonenumber) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.rating = rating;
		this.address = address;
		this.reviews = reviews;
		this.phonenumber = phonenumber;
	}

	// getting ID

	public int getID() {
		return this.id;
	}

	// setting id
	public void setID(int id) {
		this.id = id;
	}

	// getting name
	public String getRating() {
		return this.rating;
	}

	// setting name
	public void setRating(String rating) {
		this.rating = rating;
	}

	// getting name
	public String getPhonenumber() {
		return this.phonenumber;
	}

	// setting name
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}// getting name

	public String getAddress() {
		return this.address;
	}

	// setting name
	public void setaddress(String address) {
		this.address = address;
	}

}
