package com.adire.shopping.entities;

public class Manager extends Person
{
	
	private int ManagerID;
	

	Manager(int mgid, String nameIn, String lastNameIn, String email, String phoneIn) {
		super(nameIn, lastNameIn, email, phoneIn);
		// TODO Auto-generated constructor stub
		
		ManagerID = mgid;
	}


	public int getManagerID() {
		return ManagerID;
	}


	public void setManagerID(int managerID) {
		ManagerID = managerID;
	}

}
