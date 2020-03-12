package com.adire.shopping.entities;

public class Address
{
	private int HouseNumber;
	private String Street;
	private String zipCode;
	private String City;
	private String Country;
	
	
	
	Address(int housenr, String street, String city, String zipcode, String country)
	{
		HouseNumber = housenr;
		Street = street;
		zipCode = zipcode;
		City = city;
		Country = country;
		
	}	
	
	public int getHouseNumber() {
		return HouseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		HouseNumber = houseNumber;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	

}
