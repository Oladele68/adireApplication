package com.adire.shopping.service.impl;

import com.adire.shopping.dao.impl.CustomerDaoImpl;
import com.adire.shopping.dto.CustomerDto;
import com.adire.shopping.service.CustomerService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService
{


    @Override
   public List<CustomerDto> getAllCustomerOrders(String customerID) throws SQLException
   {
       CustomerDaoImpl customerDao = new CustomerDaoImpl();
       List<CustomerDto> customerList = new ArrayList<CustomerDto>();
       customerList = customerDao.getAllCustomerOrders(customerID);
       return customerList;

   }


}
