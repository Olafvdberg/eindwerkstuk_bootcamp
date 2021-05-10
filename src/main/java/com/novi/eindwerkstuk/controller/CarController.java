package com.novi.eindwerkstuk.controller;

import com.novi.eindwerkstuk.model.Car;
import com.novi.eindwerkstuk.model.Customer;
import com.novi.eindwerkstuk.repository.CarRepository;
import com.novi.eindwerkstuk.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.io.IOException;
import java.net.URI;

@RestController
@RequestMapping("/v1")
public class CarController {

    @Autowired
    CarService carService;

    @Autowired
    private CarRepository carRepository;

    @GetMapping(value = "/car")
    public ResponseEntity<Object> getCar() {
        return ResponseEntity.ok().body(carService.getAllCars());
    }

    @GetMapping(value = "/car/{id}")
    public ResponseEntity<Object> getCar(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(carService.getCarById(id), HttpStatus.OK);
    }

    private static final String storageLocation = "D://duaal leertraject belastingdienst//belastingdienst//eerste jaar//eindopdracht bootcamp";

    @RequestMapping(value = "/car/file-upload", method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        multipartFile.transferTo(new File(storageLocation + multipartFile.getOriginalFilename()));
        return "File successfully uploaded!";
    }

    @PostMapping(value = "car")
    public Car addCar(@RequestBody Car car) {
        return carRepository.save(car);
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
