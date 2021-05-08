package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "car_apk")
public class CarAPK {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @MapsId("carId")
    @JoinColumn(name = "car_id")
    @JsonIgnoreProperties("car_apk")
    private Car car;

    @ManyToOne
    @MapsId("apkId")
    @JoinColumn(name = "apk_id")
    @JsonIgnoreProperties("car_apk")
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
