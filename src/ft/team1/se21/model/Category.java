//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Category.java
//  @ Date : 3/16/2013
//  @ Author : 
//
//


package ft.team1.se21.model;

public class Category {
	private String categoryCode;
	private String categoryName;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String categoryCode, String categoryName) {
		super();
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getName() {
		return categoryName;
	}

	public void setName(String categoryName) {
		this.categoryName = categoryName;
	}

}

