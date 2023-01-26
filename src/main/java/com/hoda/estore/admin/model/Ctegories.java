package com.hoda.estore.admin.model;

import java.util.Date;

public class Ctegories {
	
	private int categoryId;
	private String categoryName;
	private String categoryDescription;
	private String categoryImageUrl;
	private int active;
	private Date addedOn;
	
	public Ctegories() {
		super();
	}

	public Ctegories(int categoryId, String categoryName, String categoryDescription, String categoryImageUrl,
			int active, Date addedOn) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryImageUrl = categoryImageUrl;
		this.active = active;
		this.addedOn = addedOn;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getCategoryImageUrl() {
		return categoryImageUrl;
	}

	public void setCategoryImageUrl(String categoryImageUrl) {
		this.categoryImageUrl = categoryImageUrl;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	@Override
	public String toString() {
		return "Ctegories [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription="
				+ categoryDescription + ", categoryImageUrl=" + categoryImageUrl + ", active=" + active + ", addedOn="
				+ addedOn + "]";
	}
	
	
	
	

}
