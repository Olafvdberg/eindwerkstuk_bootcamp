package com.novi.eindwerkstuk.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActionTest {

    private Action action;

    @BeforeEach
    void setUp() {
        this.action = new Action("vervangen achterlamp", 45, "vervangen achterlamp", 45);
    }

    @Test
    void testAction_name() {
        String expectedaction_name= "vervangen achterlamp";
        String actualaction_name = this.action.getAction_name();
        assertEquals(expectedaction_name, actualaction_name);
    }

    @Test
    void testAction_price() {
        float expectedaction_price= 45;
        float actualaction_price = this.action.getAction_price();
        assertEquals(expectedaction_price, actualaction_price);
    }

    @Test
    void testAction_Used_Name() {
        String expectedaction_used_name= "vervangen achterlamp";
        String actualaction_used_name = this.action.getAction_used_name();
        assertEquals(expectedaction_used_name, actualaction_used_name);
    }

    @Test
    void testAction_Used_price() {
        float expectedaction_used_price= 45;
        float actualaction_used_price = this.action.getAction_used_price();
        assertEquals(expectedaction_used_price, actualaction_used_price);
    }
}