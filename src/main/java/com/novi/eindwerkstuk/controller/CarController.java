package com.novi.eindwerkstuk.controller;

import com.novi.eindwerkstuk.model.Car;
import com.novi.eindwerkstuk.model.Customer;
import com.novi.eindwerkstuk.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/car/{id}")
    public ResponseEntity<Object> getCar(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(carService.getCarById(id), HttpStatus.OK);
    }

    @PostMapping(value = "car")
    public ResponseEntity<Object> addCar(@RequestBody Car car) {
        long newId = carService.addCar(car);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newId)
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/car/{id}")
    public ResponseEntity<Object> deleteCar(@PathVariable("id") Integer id) {
        carService.deleteCar(id);
        return new ResponseEntity<>("Record deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/car/{id}")
    public ResponseEntity<Object> updateCar(@PathVariable("id") Integer id, @RequestBody Car car) {
        carService.updateCar(id, car);
        return new ResponseEntity<>("Record updated", HttpStatus.NO_CONTENT);
    }
}