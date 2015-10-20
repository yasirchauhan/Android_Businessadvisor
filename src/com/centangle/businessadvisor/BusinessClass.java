package com.centangle.businessadvisor;

import java.io.Serializable;

public class BusinessClass {

	
	public int id;
	public String name;
	public String image;
	public int rating;

	public BusinessClass(int id,String name, String image, int rating) {
        this.id=id;
		this.name = name;
		this.image = image;
		this.rating = rating;

	}

	public int getId() {
		return this.id;
	}

	// setting name
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}

	// setting name
	public void setName(String name) {
		this.name = name;
	}

	// getting name
	public int getRating() {
		return this.rating;
	}

	// setting name
	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getImage(String image) {
		return this.image;

	}

	public void setImage(String image) {
		this.image = image;
	}

}