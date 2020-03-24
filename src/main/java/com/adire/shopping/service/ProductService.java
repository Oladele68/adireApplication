package com.adire.shopping.service;

import com.adire.shopping.dto.ProductDto;

import java.sql.SQLException;
import java.util.List;

public interface ProductService {

    public List<ProductDto> getProductDetailsByDesigner(String designerCode) throws SQLException;

    public List<ProductDto> getProductDetailsByBrand(String brandCode) throws SQLException;

    public ProductDto getSingleProductDetails(String productCode) throws SQLException;

}
