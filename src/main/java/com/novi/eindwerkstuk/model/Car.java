package com.novi.eindwerkstuk.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long car_id;

    @Column(length = 80)
    private String brand;

    @Column(length = 80)
    private String type;

    @Column(length = 10)
    private String license_plate;

    @Column(length = 80)
    private String car_paper;

    @OneToMany(mappedBy = "car")
    @JsonIgnoreProperties("car")
    List<CustomerCar> customer_car;

    @OneToMany(mappedBy = "car")
    @JsonIgnoreProperties("car")
    List<CarAPK> car_apk;

    //getters and setters


    public long getCar_id() {
        return car_id;
    }

    public void setCar_id(long car_id) {
        this.car_id = car_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public String getCar_paper() {
        return car_paper;
    }

    public void setCar_paper(String car_paper) {
        this.car_paper = car_paper;
    }

    public List<CustomerCar> getCustomer_car() {
        return customer_car;
    }

    public void setCustomer_car(List<CustomerCar> customer_car) {
        this.customer_car = customer_car;
    }

    public List<CarAPK> getCar_apk() {
        return car_apk;
    }

    public void setCar_apk(List<CarAPK> car_apk) {
        this.car_apk = car_apk;
    }
}
