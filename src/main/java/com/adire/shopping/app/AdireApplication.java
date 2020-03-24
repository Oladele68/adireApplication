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

		//product by brand
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


		//single product
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



		// All Customer Order By Date

		// All Customer Order By Brand
		// All Customer Order By Designer
		// Single Customer
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

	//  Customer

	/*private List<CustomerDto> getAllCustomerOrder(String customerCode) throws SQLException
	{

		List<CustomerDto> customerList = new ArrayList<CustomerDto>();
		CustomerFacadeImpl customerFacade = new CustomerFacadeImpl();
		try
		{
			customerList = customerFacade.getAllCustomerOrder(customerCode);
			return customerList;
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		return null;

	}*/
	private CustomerDto getSingleCustomerOrder(String customerCode) throws  SQLException
	{
		CustomerDto customerDto = new CustomerDto();
		CustomerFacadeImpl customerFacade = new CustomerFacadeImpl();

		try
		{
			customerDto = customerFacade.getSingleCustomerOrder(customerCode);
			return customerDto;

		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return  null;


	}
	private List<CustomerDto> getAllCustomerOrderByBrand(String brandCode) throws SQLException
	{
		List<CustomerDto> customerList = new ArrayList<CustomerDto>();
		CustomerFacadeImpl customerFacade = new CustomerFacadeImpl();
		try
		{
			customerList = customerFacade.getAllCustomerOrderByBrand(brandCode);
			return customerList;
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		return null;

	}
	private List<CustomerDto> getAllCustomerOrderByDesigner(String designerCode) throws SQLException
	{
		List<CustomerDto> customerList = new ArrayList<CustomerDto>();
		CustomerFacadeImpl customerFacade = new CustomerFacadeImpl();
		try
		{
			customerList = customerFacade.getAllCustomerOrderByDesigner(designerCode);
			return customerList;
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		return null;

	}





}
