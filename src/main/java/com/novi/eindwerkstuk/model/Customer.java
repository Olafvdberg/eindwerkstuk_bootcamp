package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 80, nullable = false)
    private String first_name;

    @Column(length = 80, nullable = false)
    private String last_name;

    @Column(length = 80, nullable = false)
    private String emailadres;

    @Column(length = 80, nullable = false)
    private String adres;

    @Column(length = 16, nullable = false)
    private String phonenumber;

    @OneToMany(mappedBy = "customer")
    @JsonIgnoreProperties("customer")
    List<CustomerCar> customer_car;

    // constructors

    public Customer(){

    }

    public Customer(String first_name, String last_name, String emailadres, String adres, String phonenumber) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.emailadres = emailadres;
        this.adres = adres;
        this.phonenumber = phonenumber;
    }

    // getters and setters

    public long getid() {
        return id;
    }

    public void setid(long customer_id) {
        this.id = customer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmailadres() {
        return emailadres;
    }

    public void setEmailadres(String emailadres) {
        this.emailadres = emailadres;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}



