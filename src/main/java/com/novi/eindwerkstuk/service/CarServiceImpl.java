package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.exception.RecordNotFoundException;
import com.novi.eindwerkstuk.model.Car;
import com.novi.eindwerkstuk.model.Customer;
import com.novi.eindwerkstuk.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarRepository carRepository;

    @Override
    public Car getCarById(long id) {
        if (carRepository.existsById(id)) {
            return carRepository.findById(id).get();
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public long addCar(Car car) {
        Car newCar = carRepository.save(car);
        return newCar.getCar_id();
    }

    @Override
    public void deleteCar(long id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public void updateCar(long id, Car car) {
        if (carRepository.existsById(id)) {
            Car existingCar = carRepository.findById(id).get();
            existingCar.setBrand(car.getBrand());
            existingCar.setType(car.getType());
            existingCar.setLicense_plate(car.getLicense_plate());
            existingCar.setCar_paper(car.getCar_paper());
        }
        else {
            throw new RecordNotFoundException();
        }
    }

}
