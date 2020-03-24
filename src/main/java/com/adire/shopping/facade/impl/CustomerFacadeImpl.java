package com.adire.shopping.facade.impl;

import com.adire.shopping.dto.CustomerDto;
import com.adire.shopping.facade.CustomerFacade;
import com.adire.shopping.service.impl.CustomerServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerFacadeImpl implements CustomerFacade
{


    @Override
    public List<CustomerDto> getAllCustomerOrders(String customerID) throws SQLException
    {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        List<CustomerDto> customerDtoList = new ArrayList<CustomerDto>();
        try{
            customerDtoList = customerService.getAllCustomerOrders(customerID);
            return  customerDtoList;

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;

    }


}
