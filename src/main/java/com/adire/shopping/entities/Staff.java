package com.adire.shopping.entities;

public class Staff extends Person
{
	private int StaffID;
	private int StoreID;
	private int ManagerID;
	private char Active;
	
	// declaring an Object
	Store s;

	/* Staff(int staffID,String nameIn, String lastNameIn, String email, String phoneIn, int storeId,int managerId)
	{
		super(nameIn, lastNameIn, email, phoneIn);
		// TODO Auto-generated constructor stub
		
		setStaffID(staffID);
		setStoreID(storeId);
		setManagerID(managerId);
		
		// creating & referencing an Object
		s = new Store();
		
		
		
	} */
	
	
	Staff(int staffID,String nameIn, String lastNameIn, String email, String phoneIn,int managerId)
	{
		super(nameIn, lastNameIn, email, phoneIn);
		// TODO Auto-generated constructor stub
		
		setStaffID(staffID);
		//;
	
		setManagerID(managerId);
		
		// creating & referencing an Object
		//s = new Store();
		
		int storeId = s.getStoreID();
		setStoreID(storeId);
		
		
		
	}

	public int getStaffID() {
		return StaffID;
	}

	public void setStaffID(int staffID) {
		StaffID = staffID;
	}

	public int getStoreID() {
		return StoreID;
	}

	public void setStoreID(int storeID) {
		StoreID = storeID;
	}

	public int getManagerID() {
		return ManagerID;
	}

	public void setManagerID(int managerID) {
		ManagerID = managerID;
	}

	public char getActive() {
		return Active;
	}

	public void setActive(char active) {
		Active = active;
	}

}
