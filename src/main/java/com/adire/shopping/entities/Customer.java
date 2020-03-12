package com.adire.shopping.entities;

public class Customer extends Person
{
	private int CustomerID;
	private String Address;
	private String City;
	private String State;
	private String ZipCode;

	Customer(int cusID,String nameIn, String lastNameIn, String email, String phoneIn, String address, String city, String state, String zipCode )
	{
		super(nameIn, lastNameIn, email, phoneIn);
		// TODO Auto-generated constructor stub
		setCustomerID(cusID);
		setAddress(address);
		setCity(city);
		setState(state);
		setZipCode(zipCode);
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	

}
