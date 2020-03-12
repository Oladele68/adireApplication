package com.adire.shopping.entities;

public class Brand
{
	private int BrandID;
	private String  BrandName;
	
	
	
	Brand()
	{
		int brandid = 0;
		String brandname = "";
		
		BrandID = brandid;
		BrandName = brandname;
		
	}
	
	Brand( int brandid, String brandname)
	{
		BrandID = brandid;
		BrandName = brandname;
	}
	
	
	public int getBrandID() {
		return BrandID;
	}
	public void setBrandID(int brandID) {
		BrandID = brandID;
	}
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	
	
	
	
	

}
