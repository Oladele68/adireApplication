package com.adire.shopping.dao;

import com.adire.shopping.dto.CustomerDto;
import java.sql.SQLException;
import java.util.List;


public interface CustomerDao
{

    List<CustomerDto> getAllCustomerOrders(String customerId) throws SQLException;


}
