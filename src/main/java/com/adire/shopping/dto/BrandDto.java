package com.adire.shopping.dto;

public class BrandDto
{
    private int BrandID;
    private String  BrandName;



    BrandDto()
    {
        int brandid = 0;
        String brandname = "";

        BrandID = brandid;
        BrandName = brandname;

    }

    BrandDto( int brandid, String brandname)
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
