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
    private String voornaam;

    @Column(length = 80, nullable = false)
    private String achternaam;

    @Column(length = 80, nullable = false)
    private String emailadres;

    @Column(length = 80, nullable = false)
    private String adres;

    @Column(length = 16, nullable = false)
    private String telefoonnummer;

    @OneToMany(mappedBy = "customer")
    @JsonIgnoreProperties("customer")
    List<CustomerCar> customer_car;

    // constructors

    public Customer(){

    }

    public Customer(String voornaam, String achternaam, String emailadres, String adres, String telefoonnummer) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.emailadres = emailadres;
        this.adres = adres;
        this.telefoonnummer = telefoonnummer;
    }

    // getters and setters

    public long getid() {
        return id;
    }

    public void setid(long customer_id) {
        this.id = customer_id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
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

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }
}



