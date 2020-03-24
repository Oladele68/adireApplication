package com.adire.shopping.dto;

public class CategoryDto
{
    private int CategoryID;
    private String CategoryName;



    CategoryDto()
    {
        int id = 0;
        String name = "";

        CategoryID = id;
        CategoryName = name;

    }
    CategoryDto(int id, String name)
    {
        CategoryID = id;
        CategoryName = name;
    }



    public int getCategoryID() {
        return CategoryID;
    }
    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }
    public String getCategoryName() {
        return CategoryName;
    }
    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

}
