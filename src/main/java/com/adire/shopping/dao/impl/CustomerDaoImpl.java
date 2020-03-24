package com.adire.shopping.dao.impl;

import com.adire.shopping.constants.AdireSQLQueries;
import com.adire.shopping.dao.CustomerDao;
import com.adire.shopping.dto.CustomerDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao
{
    Connection connection = null;

    public CustomerDaoImpl()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(AdireSQLQueries.JDBC_CONNECTION);
        }catch (SQLException | ClassNotFoundException sqlException){
            sqlException.printStackTrace();
        }
    }

    @Override
    public List<CustomerDto> getAllCustomerOrders(String customerID) throws SQLException
    {
        List<CustomerDto> customerList = new ArrayList<>();
        PreparedStatement prepStatement = connection.prepareStatement(AdireSQLQueries.ALL_CUSTOMER_ORDERS_SQL);
        prepStatement.setString(1, customerID);
        ResultSet resultSet = prepStatement.executeQuery();
        while (resultSet.next())
        {
            CustomerDto cusDto = new CustomerDto();
            cusDto.setFirstName(resultSet.getString("FirstName"));
            cusDto.setLastName(resultSet.getString("LastName"));
            cusDto.setStreet(resultSet.getString("Street"));
            cusDto.setCity(resultSet.getString("City"));
            cusDto.setState(resultSet.getString("State"));
            cusDto.setZipCode(resultSet.getString("ZipCode"));
            cusDto.setPhone(resultSet.getString("Phone"));
            cusDto.setEmail(resultSet.getString("Email"));
            cusDto.setOrderStatusDescription(resultSet.getString("OrderStatusDescription"));
            cusDto.setOrderID(resultSet.getString("OrderId"));
            cusDto.setOrderTotalAmount(resultSet.getString("TotalAmount"));
            customerList.add(cusDto);
        }
        return  customerList;

    }


}
