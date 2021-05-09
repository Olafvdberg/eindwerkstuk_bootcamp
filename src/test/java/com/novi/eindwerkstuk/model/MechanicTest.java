package com.novi.eindwerkstuk.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MechanicTest {

    private Mechanic mechanic;

    @BeforeEach
    void setUp() {
        this.mechanic = new Mechanic("henk", "van de beek");
    }

    @Test
    void testMechanic_first_name() {
        String expectedmechanic_first_name= "henk";
        String actualmechanic_first_name = this.mechanic.getFirst_name();
        assertEquals(expectedmechanic_first_name, actualmechanic_first_name);
    }

    @Test
    void testMechanic_last_name() {
        String expectedmechanic_last_name= "van de beek";
        String actualmechanic_last_name = this.mechanic.getLast_name();
        assertEquals(expectedmechanic_last_name, actualmechanic_last_name);
    }
}