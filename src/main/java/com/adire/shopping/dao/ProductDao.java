package com.adire.shopping.dao;

import com.adire.shopping.dto.ProductDto;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
   List<ProductDto> getProductDetailsByDesigner(String designerCode) throws SQLException;

    List<ProductDto> getProductDetailsByStylist(String stylistCode);

    ProductDto getSingleProductDetails(String productCode);
}
