package com.novi.eindwerkstuk.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        this.car = new Car("fiat", "panda", "41-kl-tm");
    }

    @Test
    void testCar_brand() {
        String expectedcar_brand = "fiat";
        String actualcar_brand = this.car.getBrand();
        assertEquals(expectedcar_brand, actualcar_brand);
    }

    @Test
    void testCar_type() {
        String expectedcar_type = "panda";
        String actualcar_type = this.car.getBrand();
        assertEquals(expectedcar_type, actualcar_type);
    }

    @Test
    void testLicense_plate() {
        String expectedlicense_plate = "41-kl-tm";
        String actuallicense_plate = this.car.getBrand();
        assertEquals(expectedlicense_plate, actuallicense_plate);
    }

}