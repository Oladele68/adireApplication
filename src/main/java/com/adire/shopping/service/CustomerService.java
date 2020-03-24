package com.adire.shopping.service;

import com.adire.shopping.dto.CustomerDto;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService
{

    public List<CustomerDto> getAllCustomerOrders(String customerID) throws SQLException;

}
