package com.adire.shopping.dto;

public class StoreDto
{
    private int StoreID;
    private String StoreName;
    private String Phone;
    private String Address;
    private String City;
    private String State;
    private String zipCode;

    StoreDto()
    {
        int storeid = 0;
        String storename = "";
        String phone = "";
        String address = "";
        String city = "";
        String state = "";
        String zipcode = "";

        setStoreID(storeid);
        setStoreName(storename);
        setPhone(phone);
        setAddress(address);
        setCity(city);
        setState(state);
        setZipCode(zipcode);

    }

    StoreDto(int id, String sname, String phone, String address, String city, String state, String zipcode)
    {
        setStoreID(id);
        setStoreName(sname);
        setPhone(phone);
        setAddress(address);
        setCity(city);
        setState(state);
        setZipCode(zipcode);


    }

    public int getStoreID() {
        return StoreID;
    }

    public void setStoreID(int storeID) {
        StoreID = storeID;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
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
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }



}
