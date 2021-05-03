package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Car;

public interface CarService {
    Car getCarById(long id);
    long addCar(Car car);
    void deleteCar(long id);
    void updateCar(long id, Car car);
}
