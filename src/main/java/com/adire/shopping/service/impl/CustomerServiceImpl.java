package com.adire.shopping.service.impl;

import com.adire.shopping.dao.impl.CustomerDaoImpl;
import com.adire.shopping.dto.CustomerDto;
import com.adire.shopping.service.CustomerService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService
{
   /* @Override
    public List<CustomerDto> getAllCustomerOrder(String customerCode) throws SQLException
    {


    } */

    @Override
    public CustomerDto getSingleCustomerOrder(String customerCode) throws  SQLException
    {

        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        CustomerDto customerDto= new CustomerDto();
        customerDto = customerDao.getSingleCustomerOrder(customerCode);
        return customerDto;

    }

    @Override
   public List<CustomerDto> getAllCustomerOrderByBrand(String brandCode) throws SQLException
   {
       CustomerDaoImpl customerDao = new CustomerDaoImpl();
       List<CustomerDto> customerList = new ArrayList<CustomerDto>();
       customerList = customerDao.getAllCustomerOrderByBrand(brandCode);

       return customerList;

   }

    @Override
    public List<CustomerDto> getAllCustomerOrderByDesigner(String designerCode) throws SQLException
    {
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        List<CustomerDto> customerList = new ArrayList<CustomerDto>();
        customerList = customerDao.getAllCustomerOrderByDesigner(designerCode);

        return customerList;

    }
}
