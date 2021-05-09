package com.novi.eindwerkstuk.model;

import javax.persistence.*;

@Entity
@Table(name = "bon")
public class Bon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 80)
    private String status = "betaald";

    @OneToOne
    @JoinColumn(name = "license_plate", referencedColumnName = "license_plate")
    private Car car;

    @OneToOne
    @JoinColumn(name = "customer_firstname", referencedColumnName = "voornaam")
    @JoinColumn(name = "customer_lastname", referencedColumnName = "achternaam")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "apk_status", referencedColumnName = "apk_status")
    @JoinColumn(name = "apk_price", referencedColumnName = "apk_price")
    private APK apk;

    @OneToOne
    @JoinColumn(name = "part_name", referencedColumnName = "part_used_name")
    @JoinColumn(name = "part_price", referencedColumnName = "part_price_name")
    private Part part;

    @OneToOne
    @JoinColumn(name = "action_name", referencedColumnName = "action_used_name")
    @JoinColumn(name = "action_price", referencedColumnName = "action_used_price")
    private Action action;

    public Bon() {
    }

    public Bon(String status) {
        this.status = status;
    }

    public Bon(Car car, Customer customer, APK apk, Part part, Action action) {
        this.car = car;
        this.customer = customer;
        this.apk = apk;
        this.part = part;
        this.action = action;
    }

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public APK getApk() {
        return apk;
    }

    public void setApk(APK apk) {
        this.apk = apk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
