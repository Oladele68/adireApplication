package com.adire.shopping.dto;

import com.adire.shopping.entities.Product;

public class ImageDto
{
    private int ImageID;

    private String ImageName;
    private String ImageDescription;

    // private ImageSize Size;

    //
    public int ProductID;
    public String ImageURL;

    //
    Product p;

    //
    public enum ImageSize
    {
        Large,
        Medium,
        Small

    }


    ImageDto(int img, String name, String description, String url)
    {
        ImageID = img;
        ImageName = name;
        ImageDescription = description;
        ImageURL = url;
        ProductID = p.getProductID();

    }

    public int getImageID() {
        return ImageID;
    }
    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    public int getProductID() {
        return ProductID = p.getProductID();
    }

    public String getImageName() {
        return ImageName;
    }
    public void setImageName(String imageName) {
        ImageName = imageName;
    }
    public String getImageDescription() {
        return ImageDescription;
    }
    public void setImageDescription(String imageDescription) {
        ImageDescription = imageDescription;
    }


}
