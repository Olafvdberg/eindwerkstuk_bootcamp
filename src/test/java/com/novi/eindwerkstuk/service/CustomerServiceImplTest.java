package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.EindwerkstukApplication;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Customer;
import com.novi.eindwerkstuk.repository.ActionRepository;
import com.novi.eindwerkstuk.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {EindwerkstukApplication.class})
class CustomerServiceImplTest {

    @Autowired
    private CustomerService customerService;

    @MockBean
    private CustomerRepository customerRepository;

    @Mock
    Customer customer;

    @BeforeEach
    public void setUp(){}

    @Test
    public void testGetActionById() {
        customer = new Customer("olaf", "van den berg", "olafvdberg@hotmail.com", "bovendijk 61", "0658982145");

        Mockito
                .when(customerRepository.findAllById(Collections.singleton(customer.getid())))
                .thenReturn((List<Customer>) customer);

        int id = 1;
        int expected = 1;

        Customer found = customerService.getCustomerById(id);

        assertEquals(expected, found.getid());
    }
}