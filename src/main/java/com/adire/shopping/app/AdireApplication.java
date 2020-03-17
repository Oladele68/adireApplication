package com.adire.shopping.app;


import com.adire.shopping.dto.ProductDto;
import com.adire.shopping.facade.impl.ProductFacadeImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdireApplication {

	public static void main(String[] args) {
		List <ProductDto> productList = new ArrayList<ProductDto>();
		System.out.println("***********  Product List is *********" );
		AdireApplication adireApplication = new AdireApplication();
		try
		{
			adireApplication.getProductByDesignCode("AD_1");

			for(ProductDto product : productList)
			{

				System.out.println("***********  Product Short Description is *********" + product.getProductShortDescription() );
				System.out.println("***********  Product price is *********" + product.getListPrice() );
				System.out.println("***********  Product Long Description is *********" + product.getProductLongDescription() );
				System.out.println("***********  Product Code is *********" + product.getProductCode() );
				System.out.println("***********  Product designer code is *********" + product.getDesignerCode() );
				System.out.println("***********  Product image code  is *********" + product.getImageCode() );
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}



	public List<ProductDto> getProductByDesignCode(String designCode) throws SQLException {
		List<ProductDto> productList = new ArrayList<ProductDto>();
		ProductFacadeImpl productFacade = new ProductFacadeImpl();
		productList = productFacade.getProductDetailsByDesigner(designCode);
		return productList;

	}

}
