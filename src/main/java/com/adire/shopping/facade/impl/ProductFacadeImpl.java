package com.adire.shopping.facade.impl;

import com.adire.shopping.dto.ProductDto;
import com.adire.shopping.facade.ProductFacade;
import com.adire.shopping.service.impl.ProductServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductFacadeImpl implements ProductFacade {
    @Override
    public List<ProductDto> getProductDetailsByDesigner(String designerCode) {
        ProductServiceImpl productService = new ProductServiceImpl();
        List <ProductDto> productDtoList = new ArrayList<ProductDto>();
       try{
           productDtoList = productService.getProductDetailsByDesigner(designerCode);
           return productDtoList;
       }catch (Exception ex){
           ex.printStackTrace();
       }
        return null;
    }
}
