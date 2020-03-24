package com.adire.shopping.facade;

import com.adire.shopping.dto.CustomerDto;

import java.sql.SQLException;
import java.util.List;

public interface CustomerFacade
{
    public List<CustomerDto> getAllCustomerOrders(String brandCode) throws SQLException;

}
