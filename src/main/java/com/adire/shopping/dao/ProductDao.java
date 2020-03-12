package com.adire.shopping.dao;

import com.adire.shopping.entities.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
   List<Product> getProductDetailsByDesigner(String designerCode) throws SQLException;

    List<Product> getProductDetailsByStylist(String stylistCode);

    Product getSingleProductDetails(String productCode);
}
