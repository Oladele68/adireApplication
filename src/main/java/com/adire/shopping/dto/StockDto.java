package com.adire.shopping.dto;

import com.adire.shopping.entities.Product;

public class StockDto
{
    private int StoreID;
    private int Quantity;

    // public attribute
    public int ProductID;

    //
    Product p;

    StockDto()
    {
        int storeid = 0;

        int quantity = 0;

        StoreID = storeid;
        ProductID = p.getProductID();

        Quantity = quantity;

    }

    StockDto( int storeid, int productid, int quantity)
    {
        StoreID = storeid;

        ProductID = p.getProductID();
        Quantity = quantity;

    }


    public int getStoreID() {
        return StoreID;
    }
    public void setStoreID(int storeID) {
        StoreID = storeID;
    }
    public int getProductID() {
        return ProductID;
    }
	/*public void setProductID(int productID) {
		ProductID = productID;
	}*/

    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }



}
