package com.adire.shopping.service.impl;

import com.adire.shopping.dao.impl.ProductDaoImpl;
import com.adire.shopping.dto.ProductDto;
import com.adire.shopping.service.ProductService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public List<ProductDto> getProductDetailsByDesigner(String designerCode) throws SQLException {
        ProductDaoImpl productDao = new ProductDaoImpl();
        List <ProductDto> productList = new ArrayList<ProductDto>();
        productList = productDao.getProductDetailsByDesigner(designerCode);
        return productList;
    }
}
