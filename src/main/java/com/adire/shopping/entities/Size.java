package com.adire.shopping.entities;

public class Size
{
	private int SizeID;
		
	// public
	public String SizeDetail;
	public int OrderAndStyleID;
	
	
	Size()
	{
		SizeDetail = "";
	}
	public int getSizeID() {
		return SizeID;
	}
	public void setSizeID(int sizeID) {
		SizeID = sizeID;
	}
	
	

}
