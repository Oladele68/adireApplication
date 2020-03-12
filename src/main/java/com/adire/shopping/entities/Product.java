package com.adire.shopping.entities;

public class Product
{
	
	private String ProductName;
	private String modelYear;
	//private String StyleDetail;
	//private String Brand;
	
	private int ProductID;	
	private double ListPrice;	
	
	// public attributes
	public int ImageID;
	public int BrandID;
	public int CategoryID;
	public int DesignerID;
	
	//Related Objects declaration
	Image img;
	Brand brd;	
	Designer dsn;
	
	public Product()
	{	
		int id = 0;
		String name = "";
		int image = 0;
		int categoryid = 0;
				
		String modelyear= "";
		double lprice = 0;
		
		
		
		ProductID = id;
		ProductName = name;
		ImageID = image;		
		CategoryID = categoryid;
		
		modelYear = modelyear;
		ListPrice = lprice;
		
		
		//
		ImageID = img.getImageID();
		BrandID = brd.getBrandID();
		DesignerID = dsn.getDesignerID();
		
		
	}
	
	Product( int id, String name,int categoryid,String modelyear,double lprice, int styleid, int brdid )
	{
		ProductID = id;
		ProductName = name;
		
		CategoryID = categoryid;
		
		modelYear = modelyear;
		ListPrice = lprice;
		
		
		//
		ImageID = img.getImageID();
		BrandID = brd.getBrandID();
		DesignerID = dsn.getDesignerID();
	}
	
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
		
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	public double getListPrice() {
		return ListPrice;
	}
	public void setListPrice(double listPrice) {
		ListPrice = listPrice;
	}
	
	public int getImageID() {
		return ImageID = img.getImageID();
	}

	

	/*public void setImageID(int imageID) {
		ImageID = imageID;
	}*/
	
	

}
