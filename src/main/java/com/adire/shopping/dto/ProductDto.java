package com.adire.shopping.dto;

public class ProductDto {

    private int productID;
    private double listPrice;
    private String productCode;
    private String productShortDescription;
    private String productLongDescription;
    private String imageDescription;
    private String brandDescription;
    private String designerDesription;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductShortDescription() {
        return productShortDescription;
    }

    public void setProductShortDescription(String productShortDescription) {
        this.productShortDescription = productShortDescription;
    }

    public String getProductLongDescription() {
        return productLongDescription;
    }

    public void setProductLongDescription(String productLongDescription) {
        this.productLongDescription = productLongDescription;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public String getBrandDescription() {
        return brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    public String getDesignerDesription() {
        return designerDesription;
    }

    public void setDesignerDesription(String designerDesription) {
        this.designerDesription = designerDesription;
    }
}
