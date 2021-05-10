package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "car_apk")
public class CarAPK {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    @JoinColumn(name = "car_brand", referencedColumnName = "brand")
    @JoinColumn(name = "car_type", referencedColumnName = "type")
    @JoinColumn(name = "car_license_plate", referencedColumnName = "license_plate")
    private Car car;

    @OneToOne
    @JoinColumn(name = "apk_id", referencedColumnName = "apk_id")
    @JoinColumn(name = "apk_date", referencedColumnName = "apk_date")
    @JoinColumn(name = "apk_found_errors", referencedColumnName = "found_errors")
    @JoinColumn(name = "apk_status", referencedColumnName = "apk_status")
    @JoinColumn(name = "apk_price", referencedColumnName = "apk_price")
    private APK apk;

    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public APK getApk() {
        return apk;
    }

    public void setApk(APK apk) {
        this.apk = apk;
    }
}
