package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomerById(long id);
    long addCustomer(Customer customer);
    void deleteCustomer(long id);
    void updateCustomer(long id, Customer customer);
}
