package com.adire.shopping.app;


import com.adire.shopping.dao.impl.ProductDaoImpl;
import com.adire.shopping.entities.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdireApplication {

	public static void main(String[] args) {
		List <Product> productList = new ArrayList<Product>();
		System.out.println("***********  Product List is *********" );
		AdireApplication adireApplication = new AdireApplication();
		try
		{
			adireApplication.getProductByDesignCode("AD_1");
			for(Product product : productList){
				System.out.println("***********  Product name is *********" + product.getProductName() );
				System.out.println("***********  Product price is *********" + product.getListPrice() );
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}



	public List<Product> getProductByDesignCode(String designCode) throws SQLException {
		List<Product> productList = new ArrayList<Product>();
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		productList = productDaoImpl.getProductDetailsByDesigner(designCode);
		return productList;

	}

}
