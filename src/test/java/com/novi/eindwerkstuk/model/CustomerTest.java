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
    void testCustomer_voornaam() {
        String expectedCustomer_voornaam= "olaf";
        String actualCustomer_voornaam = this.customer.getVoornaam();
        assertEquals(expectedCustomer_voornaam, actualCustomer_voornaam);
    }

    @Test
    void testCustomer_achternaam() {
        String expectedCustomer_achternaam= "van den berg";
        String actualCustomer_achternaam = this.customer.getAchternaam();
        assertEquals(expectedCustomer_achternaam, actualCustomer_achternaam);
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
    void testCustomer_telefoonnummer() {
        String expectedCustomer_telefoonnummer= "0658982145";
        String actualCustomer_telefoonnummer = this.customer.getTelefoonnummer();
        assertEquals(expectedCustomer_telefoonnummer, actualCustomer_telefoonnummer);
    }

}