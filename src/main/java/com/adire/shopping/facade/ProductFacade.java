package com.adire.shopping.facade;

import com.adire.shopping.dto.ProductDto;

import java.sql.SQLException;
import java.util.List;

public interface ProductFacade
{

    public List<ProductDto> getProductDetailsByDesigner(String designerCode);


    public List<ProductDto> getProductDetailsByBrand(String brandCode);

    public ProductDto getSingleProductDetails(String productCode);



}
