package com.adire.shopping.entities;

public class OrderAndStyle
{
	private int OrderAndStyleID;
	
	
	// 
	public String StyleDetail;
	public String Material;
	public String OrderDate;
	public String RequiredDate;
	public String ShippedDate;
	public int OrderQuantity;
	
	public int CustomerID;
	public int ImageID;	
	public int DesignerID;
	public int OrderStatusID;
	public int SizeID;
	public int StoreID;
	public int StaffID;
	
	//
	Customer customer;
	Image img;
	Designer designer;
	Size size;
	Store store;
	Staff staff;
	
	// Constructor
	OrderAndStyle()
	{
		int orderAndstyleid =0;
		
		OrderAndStyleID = orderAndstyleid;
		StyleDetail = "";
		Material = "";
		OrderDate = "";
		RequiredDate = "";
		ShippedDate = "";
		OrderQuantity = 0;
		
		//
		CustomerID = customer.getCustomerID();
		ImageID = img.getImageID();
		DesignerID = designer.getDesignerID();
		SizeID = size.getSizeID();
		StoreID = store.getStoreID();
		StaffID = staff.getStaffID();		
		
	}
	
	
	public int getOrderAndStyleID() {
		return OrderAndStyleID;
	}
	public void setOrderAndStyleID(int orderAndStyleID) {
		OrderAndStyleID = orderAndStyleID;
	}
	
	//

}
