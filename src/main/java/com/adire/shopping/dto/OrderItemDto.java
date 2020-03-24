package com.adire.shopping.dto;

import com.adire.shopping.entities.OrderStatus;
import com.adire.shopping.entities.Product;

public class OrderItemDto
{
    private int ItemID;
    private int Quantity;


    //public fields
    public int ProductID;
    public String OrderCreatedDate;		// Order_Created_Date
    public double TotalOrder;
    public double Discount;
    public double ListPrice;			// List_Price

    OrderStatus Status;
    Product p;

    OrderItemDto(int itemid, int quantity)
    {
        ItemID = itemid;
        Quantity = quantity;
        ProductID = p.getProductID();
    }


    // Accessor Methods

    public int getItemID() {
        return ItemID;
    }
    public void setItemID(int itemID) {
        ItemID = itemID;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }



}
