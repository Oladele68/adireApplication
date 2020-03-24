package com.adire.shopping.dao.impl;

import com.adire.shopping.constants.AdireSQLQueries;
import com.adire.shopping.dao.CustomerDao;
import com.adire.shopping.dto.CustomerDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao
{
    Connection cnn = null;

    /**
     * Constructor to create a new connection
     */
    public CustomerDaoImpl()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn = DriverManager.getConnection(AdireSQLQueries.JDBC_CONNECTION);
        }catch (SQLException | ClassNotFoundException sqlException){
            sqlException.printStackTrace();
        }
    }
    // Return a single customer by its ID
    @Override
    public CustomerDto getSingleCustomer(String customerCode) throws SQLException
    {
        CustomerDto customerDto = new CustomerDto();
        PreparedStatement prep = cnn.prepareStatement(AdireSQLQueries.SINGLE_CUSTOMER_SQL);
        prep.setString(1,customerCode);
        ResultSet rs = prep.executeQuery();

        while (rs.next())
        {
            customerDto.setName(rs.getString("FirstName"));
            customerDto.setLastName(rs.getString("LastName"));
            customerDto.setStreet(rs.getString("Street"));
            customerDto.setCity(rs.getString("City"));
            customerDto.setState(rs.getString("State"));
            customerDto.setZipCode(rs.getString("ZipCode"));
            customerDto.setPhone(rs.getString("Phone"));
            customerDto.setEmail(rs.getString("Email"));

        }
        return customerDto;


    }

    // Return all Customers
    @Override
    public List<CustomerDto> getAllCustomers() throws SQLException
    {
        List<CustomerDto> customerList = new ArrayList<>();
        PreparedStatement prepStatement = cnn.prepareStatement(AdireSQLQueries.All_CUSTOMERS_SQL);

        ResultSet resultSet = prepStatement.executeQuery();
        while (resultSet.next())
        {
            CustomerDto cusDto = new CustomerDto();
            cusDto.setName(resultSet.getString("FirstName"));
            cusDto.setLastName(resultSet.getString("LastName"));
            cusDto.setStreet(resultSet.getString("Street"));
            cusDto.setCity(resultSet.getString("City"));
            cusDto.setState(resultSet.getString("State"));
            cusDto.setZipCode(resultSet.getString("ZipCode"));
            cusDto.setPhone(resultSet.getString("Phone"));
            cusDto.setEmail(resultSet.getString("Email"));

            // Add custDto to the list
            customerList.add(cusDto);

        }

        return  customerList;

    }

    // Return a single customer order by its ID

    @Override
    public CustomerDto getSingleCustomerOrder(String customerCode) throws  SQLException
    {
        CustomerDto customerDto = new CustomerDto();
        PreparedStatement prep = cnn.prepareStatement(AdireSQLQueries.SINGLE_CUSTOMER_SQL);
        prep.setString(1,customerCode);
        ResultSet rs = prep.executeQuery();

        while (rs.next())
        {
            customerDto.setName(rs.getString("FirstName"));
            customerDto.setLastName(rs.getString("LastName"));
            customerDto.setStreet(rs.getString("Street"));
            customerDto.setCity(rs.getString("City"));
            customerDto.setState(rs.getString("State"));
            customerDto.setZipCode(rs.getString("ZipCode"));
            customerDto.setPhone(rs.getString("Phone"));
            customerDto.setEmail(rs.getString("Email"));

        }
        return customerDto;
    }

    // Return All customers' order
 /*   @Override
   public List<CustomerDto> getAllCustomerOrder(String customerCode) throws SQLException
    {
        List<CustomerDto> customerList = new ArrayList<>();
        PreparedStatement prepStatement = cnn.prepareStatement(AdireSQLQueries.ALL_CUSTOMERS_ORDER_SQL);
        prepStatement.setString(1,customerCode);


    }  */





   // Return a single customer order by Brand
 /*  @Override
   public CustomerDto getSingleCustomerOrderByBrand(String customerCode) throws SQLException
   {

   } */

   // Return all customer order by Brand
    @Override
    public List<CustomerDto> getAllCustomerOrderByBrand(String brandCode) throws SQLException
    {
        List<CustomerDto> customerList = new ArrayList<>();
        PreparedStatement prepStatement = cnn.prepareStatement(AdireSQLQueries.PRODUCT_SQL_BRAND);
        prepStatement.setString(1,brandCode);
        ResultSet resultSet = prepStatement.executeQuery();
        while(resultSet.next())
        {
            CustomerDto cusDto = new CustomerDto();
            cusDto.setName(resultSet.getString("FirstName"));
            cusDto.setLastName(resultSet.getString("LastName"));
            cusDto.setStreet(resultSet.getString("Street"));
            cusDto.setCity(resultSet.getString("City"));
            cusDto.setState(resultSet.getString("State"));
            cusDto.setZipCode(resultSet.getString("ZipCode"));
            cusDto.setPhone(resultSet.getString("Phone"));
            cusDto.setEmail(resultSet.getString("Email"));


            customerList.add(cusDto);
        }
        return customerList;

    }

    // Return a single customer order by Designer
   /* @Override
    public CustomerDto getSingleCustomerOrderByDesigner(String customerCode) throws SQLException
    {

    }  */

    @Override
    public List<CustomerDto> getAllCustomerOrderByDesigner(String designerCode) throws SQLException
    {
        List<CustomerDto> customerList = new ArrayList<>();
        PreparedStatement prepStatement = cnn.prepareStatement(AdireSQLQueries.ALL_CUSTOMERS_ORDER_DESIGNER_SQL);
        prepStatement.setString(1,designerCode);
        ResultSet resultSet = prepStatement.executeQuery();
        while(resultSet.next())
        {
            CustomerDto cusDto = new CustomerDto();
            cusDto.setName(resultSet.getString("FirstName"));
            cusDto.setLastName(resultSet.getString("LastName"));
            cusDto.setStreet(resultSet.getString("Street"));
            cusDto.setCity(resultSet.getString("City"));
            cusDto.setState(resultSet.getString("State"));
            cusDto.setZipCode(resultSet.getString("ZipCode"));
            cusDto.setPhone(resultSet.getString("Phone"));
            cusDto.setEmail(resultSet.getString("Email"));


            customerList.add(cusDto);
        }
        return customerList;

    }

}
