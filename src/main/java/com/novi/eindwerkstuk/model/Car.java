package com.novi.eindwerkstuk.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

    @Column(length = 80)
    private String brand;

    @Column(length = 80)
    private String type;

    @Column(length = 10)
    private String license_plate;

    @Column(length = 80)
    private String car_paper;

    //getters and setters

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
}
