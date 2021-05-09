package com.novi.eindwerkstuk.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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

    public Car(String brand, String type, String license_plate, String car_paper) {
        this.brand = brand;
        this.type = type;
        this.license_plate = license_plate;
        this.car_paper = car_paper;
    }

    //getters and setters


    public long getid() {
        return id;
    }

    public void setid(long car_id) {
        this.id = id;
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
}
