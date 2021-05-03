package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Customer;

public interface CustomerService {

    Customer getCustomerById(long id);
    long addCustomer(Customer customer);
    void deleteCustomer(long id);
    void updateCustomer(long id, Customer customer);
}
