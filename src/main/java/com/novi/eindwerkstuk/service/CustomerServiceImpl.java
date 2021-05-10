package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.exception.RecordNotFoundException;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Customer;
import com.novi.eindwerkstuk.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(long id) {
        if (customerRepository.existsById(id)) {
            return customerRepository.findById(id).get();
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public long addCustomer(Customer customer) {
        Customer newCustomer = customerRepository.save(customer);
        return newCustomer.getid();
    }

    @Override
    public void deleteCustomer(long id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public void updateCustomer(long id, Customer customer) {
        if (customerRepository.existsById(id)) {
            Customer existingCustomer = customerRepository.findById(id).get();
            existingCustomer.setFirst_name(customer.getFirst_name());
            existingCustomer.setLast_name(customer.getLast_name());
            existingCustomer.setEmailadres(customer.getEmailadres());
            existingCustomer.setAdres(customer.getAdres());
            existingCustomer.setPhonenumber(customer.getPhonenumber());
        }
        else {
            throw new RecordNotFoundException();
        }
    }

}
