package com.novi.eindwerkstuk.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        this.customer = new Customer("olaf", "van den berg", "olafvdberg@hotmail.com", "Bovendijk 61", "0658982145");
    }

    @Test
    void testCustomer_first_name() {
        String expectedCustomer_first_name= "olaf";
        String actualCustomer_first_name = this.customer.getFirst_name();
        assertEquals(expectedCustomer_first_name, actualCustomer_first_name);
    }

    @Test
    void testCustomer_last_name() {
        String expectedCustomer_last_name= "van den berg";
        String actualCustomer_last_name = this.customer.getLast_name();
        assertEquals(expectedCustomer_last_name, actualCustomer_last_name);
    }

    @Test
    void testCustomer_emailadres() {
        String expectedCustomer_emailadres= "olafvdberg@hotmail.com";
        String actualCustomer_emailadres = this.customer.getEmailadres();
        assertEquals(expectedCustomer_emailadres, actualCustomer_emailadres);
    }

    @Test
    void testCustomer_adres() {
        String expectedCustomer_adres= "Bovendijk 61";
        String actualCustomer_adres = this.customer.getAdres();
        assertEquals(expectedCustomer_adres, actualCustomer_adres);
    }

    @Test
    void testCustomer_phonenumber() {
        String expectedCustomer_phonenumber= "0658982145";
        String actualCustomer_phonenumber = this.customer.getPhonenumber();
        assertEquals(expectedCustomer_phonenumber, actualCustomer_phonenumber);
    }

}