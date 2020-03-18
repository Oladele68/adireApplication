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

    @Override
    public List<ProductDto> getProductDetailsByBrand(String brandCode) throws SQLException {
        ProductDaoImpl productDao = new ProductDaoImpl();
        List<ProductDto> productList = new ArrayList<ProductDto>();
        productList = productDao.getProductDetailsByBrand(brandCode);
        return productList;
    }

    @Override
    public ProductDto getSingleProductDetails(String productCode) throws SQLException {
        ProductDaoImpl productDao = new ProductDaoImpl();
        ProductDto productDto = new ProductDto();
        productDto = productDao.getSingleProductDetails(productCode);
        return productDto;


    }


}
