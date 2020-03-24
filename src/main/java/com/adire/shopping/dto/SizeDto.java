package com.adire.shopping.dto;

public class SizeDto
{
    private int SizeID;

    // public
    public String SizeDetail;
    public int OrderAndStyleID;


    SizeDto()
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
