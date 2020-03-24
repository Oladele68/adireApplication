package com.adire.shopping.dto;

public class CustomerDto extends PersonDto
{
    private int CustomerID;
    private String Street;
    private String City;
    private String State;
    private String ZipCode;




    public String getStreet() {
        return Street;
    }

    public void setStreet(String streetIn) {
        Street = streetIn;
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
