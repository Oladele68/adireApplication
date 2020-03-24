package com.adire.shopping.dao;

import com.adire.shopping.dto.CustomerDto;
import java.sql.SQLException;
import java.util.List;


public interface CustomerDao
{
    CustomerDto getSingleCustomer(String customerCode) throws SQLException;

    List<CustomerDto> getAllCustomers() throws SQLException;

    CustomerDto getSingleCustomerOrder(String customerCode) throws  SQLException;

   /* List<CustomerDto> getAllCustomerOrder(String orderDate) throws SQLException; */

   /* CustomerDto getSingleCustomerOrderByBrand(String customerCode) throws SQLException; */

    List<CustomerDto> getAllCustomerOrderByBrand(String brandCode) throws SQLException;

   /* CustomerDto getSingleCustomerOrderByDesigner(String customerCode) throws SQLException; */

    List<CustomerDto> getAllCustomerOrderByDesigner(String designerCode) throws SQLException;

}
