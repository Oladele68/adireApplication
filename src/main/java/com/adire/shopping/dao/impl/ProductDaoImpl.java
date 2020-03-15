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
            while(resultSet.next()){

                ProductDto productDto = new ProductDto();
                productDto.setProductCode(resultSet.getString("ProductCode"));
                productDto.setProductCode(resultSet.getString("ProductShortDesc"));
                productDto.setProductCode(resultSet.getString("ProductLongDescription"));
                productDto.setProductCode(resultSet.getString("ImageCode"));
                productDto.setProductCode(resultSet.getString("BrandCode"));
                productDto.setProductCode(resultSet.getString("DesignerCode"));
                productDto.setProductCode(resultSet.getString("ListPrice"));
                productList.add(productDto);
        }
        return productList;
    }

    @Override
    public List<ProductDto> getProductDetailsByStylist(String stylistCode) {
        return null;
    }

    @Override
    public ProductDto getSingleProductDetails(String productCode) {
        return null;
    }
}
