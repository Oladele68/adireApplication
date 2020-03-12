package com.adire.shopping.dao.impl;

import com.adire.shopping.constants.AdireSQLQueries;
import com.adire.shopping.dao.ProductDao;
import com.adire.shopping.entities.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ProductDaoImpl implements ProductDao {
    Properties properties = null;
    @Override
    public List<Product> getProductDetailsByDesigner(String designerCode) throws SQLException {
        List <Product> productList = new ArrayList<Product>();
        Connection connection = DriverManager.getConnection("", properties);
        PreparedStatement preparedStatement = connection.prepareStatement(AdireSQLQueries.PRODUCT_SQL_DESIGNERS);
        preparedStatement.setString(1, designerCode);
        ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){

                Product product = new Product();

                product.setProductName(resultSet.getString("ProductName"));

                productList.add(product);
        }
        return productList;
    }

    @Override
    public List<Product> getProductDetailsByStylist(String stylistCode) {
        return null;
    }

    @Override
    public Product getSingleProductDetails(String productCode) {
        return null;
    }
}
