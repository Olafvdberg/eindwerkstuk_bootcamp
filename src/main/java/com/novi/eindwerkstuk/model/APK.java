package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "APK")
public class APK implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long apk_id;

    @Column(length = 80)
    private String apk_date;

    @Column(length = 80)
    private String apk_status;

    @Column(length = 80)
    private String found_errors;

    @Column(length = 80)
    private long apk_price;

    @OneToMany(mappedBy = "apk")
    @JsonIgnoreProperties("apk")
    List<CarAPK> car_apk;

    @OneToMany(mappedBy = "apk")
    @JsonIgnoreProperties("apk")
    List<ReperationAPK> reperation_apk;

    @OneToMany(mappedBy = "apk")
    @JsonIgnoreProperties("apk")
    List<APKMechanic> apk_mechanic;

    //constructor

    public APK() {

    }

    public APK(String apk_date, String apk_status, String found_errors, long apk_price) {
        this.apk_date = apk_date;
        this.apk_status = apk_status;
        this.found_errors = found_errors;
        this.apk_price = apk_price;
    }

    //getters and setters
    public long getApk_id() {
        return apk_id;
    }

    public void setApk_id(long apk_id) {
        this.apk_id = apk_id;
    }

    public String getApk_date() {
        return apk_date;
    }

    public void setApk_date(String apk_date) {
        this.apk_date = apk_date;
    }

    public String getApk_status() {
        return apk_status;
    }

    public void setApk_status(String apk_status) {
        this.apk_status = apk_status;
    }

    public String getFound_errors() {
        return found_errors;
    }

    public void setFound_errors(String found_errors) {
        this.found_errors = found_errors;
    }

    public List<CarAPK> getCar_apk() {
        return car_apk;
    }

    public void setCar_apk(List<CarAPK> car_apk) {
        this.car_apk = car_apk;
    }

    public List<ReperationAPK> getReperation_apk() {
        return reperation_apk;
    }

    public void setApk_reperation(List<ReperationAPK> reperation_apk) {
        this.reperation_apk = reperation_apk;
    }

    public List<APKMechanic> getApk_mechanic() {
        return apk_mechanic;
    }

    public void setApk_mechanic(List<APKMechanic> apk_mechanic) {
        this.apk_mechanic = apk_mechanic;
    }

    public long getApk_price() {
        return apk_price;
    }

    public void setApk_price(long apk_price) {
        this.apk_price = apk_price;
    }
}
