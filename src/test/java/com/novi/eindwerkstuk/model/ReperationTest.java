package com.novi.eindwerkstuk.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReperationTest {

    private Reperation reperation;

    @BeforeEach
    void setUp() {
        this.reperation = new Reperation("5 mei 2021", "gedaan");
    }

    @Test
    void testReperation_date() {
        String expectedReperation_date= "5 mei 2021";
        String actualReperation_date = this.reperation.getReperation_date();
        assertEquals(expectedReperation_date, actualReperation_date);
    }

    @Test
    void testReperation_status() {
        String expectedReperation_status= "gedaan";
        String actualReperation_status = this.reperation.getStatus();
        assertEquals(expectedReperation_status, actualReperation_status);
    }

}