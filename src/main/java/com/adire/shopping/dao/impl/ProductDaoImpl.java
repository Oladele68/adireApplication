package com.adire.shopping.dao.impl;

import com.adire.shopping.constants.AdireSQLQueries;
import com.adire.shopping.dao.ProductDao;
import com.adire.shopping.dto.ProductDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    @Override
    public List<ProductDto> getProductDetailsByDesigner(String designerCode) throws SQLException {
        List <ProductDto> productList = new ArrayList<ProductDto>();
        Connection connection = DriverManager.getConnection(AdireSQLQueries.JDBC_CONNECTION);
        PreparedStatement preparedStatement = connection.prepareStatement(AdireSQLQueries.PRODUCT_SQL_DESIGNERS);
        preparedStatement.setString(1, designerCode);
        ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {

                ProductDto productDto = new ProductDto();
                productDto.setProductCode(resultSet.getString("ProductCode"));
                productDto.setProductShortDescription(resultSet.getString("ProductShortDesc"));
                productDto.setProductLongDescription(resultSet.getString("ProductLongDescription"));
                productDto.setImageCode(resultSet.getString("ImageCode"));
                productDto.setBrandCode(resultSet.getString("BrandCode"));
                productDto.setDesignerCode(resultSet.getString("DesignerCode"));
                productDto.setListPrice(resultSet.getDouble("ListPrice"));
                productList.add(productDto);
        }
        return productList;
    }

    @Override
    public List<ProductDto> getProductDetailsByBrand(String brandCode) throws SQLException
    {
        List <ProductDto> productListByBrand = new ArrayList<ProductDto>();
        Connection connection = DriverManager.getConnection(AdireSQLQueries.JDBC_CONNECTION);
        PreparedStatement preparedStatement = connection.prepareStatement(AdireSQLQueries.PRODUCT_SQL_BRAND);
        preparedStatement.setString( 1, brandCode);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next())
        {
            ProductDto productDto = new ProductDto();
            productDto.setProductCode(rs.getString("ProductCode"));
            productDto.setProductShortDescription(rs.getString("ProductShortDesc"));
            productDto.setProductLongDescription(rs.getString("ProductLongDescription"));
            productDto.setListPrice(rs.getDouble("ListPrice"));
            productDto.setImageCode(rs.getString("ImageCode"));
            productDto.setBrandCode(rs.getString("BrandCode"));
            productDto.setDesignerCode(rs.getString("DesignerCode"));

            productListByBrand.add(productDto);

        }

        return productListByBrand;
    }

    @Override
    public ProductDto getSingleProductDetails(String productCode) throws  SQLException
    {
        ProductDto productDto;
        productDto = new ProductDto();
        String query = "SELECT ProductCode, ProductShortDesc, ProductLongDescription, ListPrice, ImageCode" +
                "BrandCode, DesignerCode FROM Product WHERE ProductCode = " + productCode;
        Connection connection = DriverManager.getConnection(AdireSQLQueries.JDBC_CONNECTION);
        PreparedStatement prep = connection.prepareStatement(query);
        prep.setString(1, productCode);
        ResultSet resultSet = prep.executeQuery();


        while (resultSet.next())
        {

            productDto.setProductCode(resultSet.getString("ProductCode"));
            productDto.setProductShortDescription(resultSet.getString("ProductShortDesc"));
            productDto.setProductLongDescription(resultSet.getString("ProductLongDescription"));
            productDto.setListPrice(resultSet.getDouble("ListPrice"));
            productDto.setImageCode(resultSet.getString("ImageCode"));
            productDto.setBrandCode(resultSet.getString("BrandCode"));
            productDto.setDesignerCode(resultSet.getString("DesignerCode"));
        }

        return productDto;
    }
}
