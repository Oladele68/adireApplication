package com.adire.shopping.dao.impl;

import com.adire.shopping.constants.AdireSQLQueries;
import com.adire.shopping.dao.ProductDao;
import com.adire.shopping.dto.ProductDto;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {


    Connection connection = null;

    /**
     * Constructor to create a new connection
     */
    public ProductDaoImpl() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(AdireSQLQueries.JDBC_CONNECTION);
            }catch (SQLException | ClassNotFoundException sqlException){
            sqlException.printStackTrace();
        }
     }

    @Override
    public List<ProductDto> getProductDetailsByDesigner(String designerCode) throws SQLException {
        List <ProductDto> productList = new ArrayList<ProductDto>();
        PreparedStatement preparedStatement = connection.prepareStatement(AdireSQLQueries.PRODUCT_SQL_DESIGNERS);
       preparedStatement.setString(1, designerCode);
        ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {

                ProductDto productDto = new ProductDto();
                productDto.setProductCode(resultSet.getString("ProductCode"));
                productDto.setProductShortDescription(resultSet.getString("ProductShortDesc"));
                productDto.setProductLongDescription(resultSet.getString("ProductLongDescription"));
                productDto.setImageDescription(resultSet.getString("ImageDescription"));
                productDto.setBrandDescription(resultSet.getString("BrandDescription"));
                productDto.setDesignerDesription(resultSet.getString("DesignerDescription"));
                productDto.setListPrice(resultSet.getDouble("ListPrice"));
                productList.add(productDto);
        }
        return productList;
    }

    @Override
    public List<ProductDto> getProductDetailsByBrand(String brandCode) throws SQLException
    {
        List <ProductDto> productListByBrand = new ArrayList<ProductDto>();
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
            productDto.setImageDescription(rs.getString("ImageDescription"));
            productDto.setBrandDescription(rs.getString("BrandDescription"));
            productDto.setDesignerDesription(rs.getString("DesignerDescription"));
            productListByBrand.add(productDto);

        }

        return productListByBrand;
    }

    @Override
    public ProductDto getSingleProductDetails(String productCode) throws  SQLException
    {
        ProductDto productDto;
        productDto = new ProductDto();
        PreparedStatement preparedStatement = connection.prepareStatement(AdireSQLQueries.SINGLE_PRODUCT_SQL);
        preparedStatement.setString(1, productCode);
        ResultSet resultSet = preparedStatement.executeQuery();


        while (resultSet.next())
        {

            productDto.setProductCode(resultSet.getString("ProductCode"));
            productDto.setProductShortDescription(resultSet.getString("ProductShortDesc"));
            productDto.setProductLongDescription(resultSet.getString("ProductLongDescription"));
            productDto.setListPrice(resultSet.getDouble("ListPrice"));
            productDto.setImageDescription(resultSet.getString("ImageDescription"));
            productDto.setBrandDescription(resultSet.getString("BrandDescription"));
            productDto.setDesignerDesription(resultSet.getString("DesignerDescription"));

        }

        return productDto;
    }
}
