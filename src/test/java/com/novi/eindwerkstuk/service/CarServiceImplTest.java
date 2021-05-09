package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.EindwerkstukApplication;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Car;
import com.novi.eindwerkstuk.repository.ActionRepository;
import com.novi.eindwerkstuk.repository.CarRepository;
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
class CarServiceImplTest {

    @Autowired
    private CarService carService;

    @MockBean
    private CarRepository carRepository;

    @Mock
    Car car;

    @BeforeEach
    public void setUp(){}

    @Test
    public void testGetActionById() {
        car = new Car("fiat", "panda", "41-kl-zm");

        Mockito
                .when(carRepository.findAllById(Collections.singleton(car.getid())))
                .thenReturn((List<Car>) car);

        int id = 1;
        int expected = 1;

        Car found = carService.getCarById(id);

        assertEquals(expected, found.getid());
    }
}