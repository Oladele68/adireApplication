package com.adire.shopping.app;


import com.adire.shopping.dto.CustomerDto;
import com.adire.shopping.dto.ProductDto;
import com.adire.shopping.facade.impl.CustomerFacadeImpl;
import com.adire.shopping.facade.impl.ProductFacadeImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdireApplication {

	public static void main(String[] args) {
		List <ProductDto> productList = new ArrayList<ProductDto>();
		List <CustomerDto> customerList = new ArrayList<CustomerDto>();

		AdireApplication adireApplication = new AdireApplication();


		try
		{
			productList = adireApplication.getProductByDesignCode("Designer01");
			System.out.println("***********  Product Designed by Designer1 *********  " );

			for(ProductDto product : productList)
			{
				System.out.println("Product Short Description is : " + product.getProductShortDescription() );
				System.out.println("Product price is : " + product.getListPrice() );
				System.out.println("Product Long Description is : " + product.getProductLongDescription() );
				System.out.println("Product Code is : " + product.getProductCode() );
				System.out.println("Product designer description is : " + product.getDesignerDescription() );
				System.out.println("Product image description  is : " + product.getImageDescription() );
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}

		try
		{
			System.out.println("***********  Products MoyoCode Brand are  *********  " );
			productList = adireApplication.getProductByBrand("MoyoCode");

			for(ProductDto product : productList)
			{
				System.out.println("Product Short Description is *********" + product.getProductShortDescription() );
				System.out.println("Product price is *********" + product.getListPrice() );
				System.out.println("Product Long Description is *********" + product.getProductLongDescription() );
				System.out.println("Product Code is *********" + product.getProductCode() );
				System.out.println("Product designer description is *********" + product.getDesignerDescription() );
				System.out.println("Product image description  is *********" + product.getImageDescription() );
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}


		try
		{
			System.out.println("***********  MOPro Product details are  *********  " );

			ProductDto product = adireApplication.getSingleProductDetails("MOPro");
			System.out.println("Product Short Description is : " + product.getProductShortDescription() );
			System.out.println("Product price is : " + product.getListPrice() );
			System.out.println("Product Long Description is : " + product.getProductLongDescription() );
			System.out.println("Product Code is :" + product.getProductCode() );
			System.out.println("Product designer description is : " + product.getDesignerDescription() );
			System.out.println("Product image description  is : " + product.getImageDescription() );
		}catch (Exception ex){
			ex.printStackTrace();
		}


		System.out.println("***********  Customer Orders for Order Number 201  *********  " );

		try {
			customerList = adireApplication.getAllCustomerOrders("201");
			for (CustomerDto customer : customerList) {
				System.out.println("Order ID is : " + customer.getOrderID());
				System.out.println("Order Status description is : " + customer.getOrderStatusDescription() );
				System.out.println("Order total amount is  : " + customer.getOrderTotalAmount());
				System.out.println("Customer name is  : " + customer.getFirstName() + customer.getLastName() );
			}
		}catch (Exception exception){

		}
	}



	private List<ProductDto> getProductByDesignCode(String designCode) throws SQLException {
		List<ProductDto> productList = new ArrayList<ProductDto>();
		ProductFacadeImpl productFacade = new ProductFacadeImpl();
		productList = productFacade.getProductDetailsByDesigner(designCode);
		return productList;

	}

	private List<ProductDto> getProductByBrand(String brandCode){
		List<ProductDto> productList = new ArrayList<ProductDto>();
		ProductFacadeImpl productFacade = new ProductFacadeImpl();
		try{
			productList = productFacade.getProductDetailsByBrand(brandCode);
			return productList;
		}catch (Exception ex){
			ex.printStackTrace();
		}
		return null;

	}

	private ProductDto getSingleProductDetails(String productCode)  {
		ProductDto productDto = new ProductDto();
		ProductFacadeImpl productFacade = new ProductFacadeImpl();

		try{
			productDto = productFacade.getSingleProductDetails(productCode);
			return productDto;
		}catch (Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

	private List<CustomerDto> getAllCustomerOrders(String customerID) throws SQLException
	{
		List<CustomerDto> customerList = new ArrayList<CustomerDto>();
		CustomerFacadeImpl customerFacade = new CustomerFacadeImpl();
		try
		{
			customerList = customerFacade.getAllCustomerOrders(customerID);
			return customerList;
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		return null;
	}

}
