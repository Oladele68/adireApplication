package com.adire.shopping.dto;

public class ProductDto {

    private int productID;
    private double listPrice;
    private String productCode;
    private String productShortDescription;
    private String productLongDescription;
    private String imageCode;
    private String brandCode;
    private String designerCode;

    public int getProductID() {
        return productID;
    }

    public double getListPrice() {
        return listPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductShortDescription() {
        return productShortDescription;
    }

    public String getProductLongDescription() {
        return productLongDescription;
    }

    public String getImageCode() {
        return imageCode;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public String getDesignerCode() {
        return designerCode;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductShortDescription(String productShortDescription) {
        this.productShortDescription = productShortDescription;
    }

    public void setProductLongDescription(String productLongDescription) {
        this.productLongDescription = productLongDescription;
    }

    public void setImageCode(String imageCode) {
        this.imageCode = imageCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public void setDesignerCode(String designerCode) {
        this.designerCode = designerCode;
    }
}
