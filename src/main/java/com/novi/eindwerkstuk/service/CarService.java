package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    Car getCarById(long id);
    long addCar(Car car);
    void deleteCar(long id);
    void updateCar(long id, Car car);
}
