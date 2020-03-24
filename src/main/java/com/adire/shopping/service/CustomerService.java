package com.adire.shopping.service;

import com.adire.shopping.dto.CustomerDto;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService
{

  /* public  List<CustomerDto> getAllCustomerOrder(String customerCode) throws SQLException;*/
  public CustomerDto getSingleCustomerOrder(String customerCode) throws  SQLException;

    public List<CustomerDto> getAllCustomerOrderByBrand(String brandCode) throws SQLException;
    public List<CustomerDto> getAllCustomerOrderByDesigner(String designerCode) throws SQLException;

}
