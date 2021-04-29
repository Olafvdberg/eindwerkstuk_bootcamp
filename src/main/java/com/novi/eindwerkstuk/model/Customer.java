package com.novi.eindwerkstuk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

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

    // constructors
    public Customer() {
    }

    public Customer(String voornaam, String achternaam, String emailadres, String adres, String telefoonnummer) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.emailadres = emailadres;
        this.adres = adres;
        this.telefoonnummer = telefoonnummer;
    }

    // getters and setters

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



