package com.adire.shopping.dao;

import com.adire.shopping.dto.ProductDto;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao
{
   List<ProductDto> getProductDetailsByDesigner(String designerCode) throws SQLException;

    List<ProductDto> getProductDetailsByBrand(String brandCode) throws SQLException;

    ProductDto getSingleProductDetails(String productCode) throws SQLException;
}
