package com.adire.shopping.entities;

public class Category
{
	private int CategoryID;
	private String CategoryName;
	
	
	
	Category()
	{ 
		int id = 0;
		String name = "";
		
		CategoryID = id;
		CategoryName = name;
		
	}
	Category(int id, String name)
	{
		CategoryID = id;
		CategoryName = name;
	}
	
	
	
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	

}
