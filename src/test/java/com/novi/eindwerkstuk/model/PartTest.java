package com.novi.eindwerkstuk.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartTest {

    private Part part;

    @BeforeEach
    void setUp() {
        this.part = new Part("achterlamp", 45, "achterlamp", 45);
    }

    @Test
    void testPart_name() {
        String expectedPart_name= "achterlamp";
        String actualPart_name = this.part.getPart_name();
        assertEquals(expectedPart_name, actualPart_name);
    }

    @Test
    void testPart_price() {
        float expectedPart_price= 45;
        float actualPart_price = this.part.getPart_price();
        assertEquals(expectedPart_price, actualPart_price);
    }

    @Test
    void testPart_Used_Name() {
        String expectedPart_used_name= "achterlamp";
        String actualPart_used_name = this.part.getPart_used_name();
        assertEquals(expectedPart_used_name, actualPart_used_name);
    }

    @Test
    void testPart_price_name() {
        float expectedPart_price_name= 45;
        float actualPart_price_name = this.part.getPart_price_name();
        assertEquals(expectedPart_price_name, actualPart_price_name);
    }

}