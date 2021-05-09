package com.novi.eindwerkstuk.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    private Stock stock;

    @BeforeEach
    void setUp() {
        this.stock = new Stock("achterlamp", 30, 5);
    }

    @Test
    void testStock_part_name() {
        String expectedStock_part_name= "achterlamp";
        String actualStock_part_name = this.stock.getPart_name_stock();
        assertEquals(expectedStock_part_name, actualStock_part_name);
    }

    @Test
    void testpart_price_stock() {
        float expectedpart_price_stock= 30;
        float actualpart_price_stock = this.stock.getPart_price_stock();
        assertEquals(expectedpart_price_stock, actualpart_price_stock);
    }

    @Test
    void testpart_amount_in_stock() {
        int expectedpart_amount_in_stock= 5;
        int actualpart_amount_in_stock = this.stock.getAmount_in_stock();
        assertEquals(expectedpart_amount_in_stock, actualpart_amount_in_stock);
    }

}