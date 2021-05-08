package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "apk_mechanic")
public class APKMechanic {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @MapsId("apkId")
    @JoinColumn(name = "apk_id")
    @JsonIgnoreProperties("apk_mechanic")
    private APK apk;

    @OneToOne
    @MapsId("mechanicId")
    @JoinColumn(name = "mechanic_id")
    @JsonIgnoreProperties("apk_mechanic")
    private Mechanic mechanic;

    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public APK getApk() {
        return apk;
    }

    public void setApk(APK apk) {
        this.apk = apk;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }
}
