package com.adire.shopping.facade;

import com.adire.shopping.dto.ProductDto;

import java.util.List;

public interface ProductFacade {

    public List<ProductDto> getProductDetailsByDesigner(String designerCode);


    }
