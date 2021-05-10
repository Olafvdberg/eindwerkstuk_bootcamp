package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "reperation_apk")
public class ReperationAPK {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "apk_id", referencedColumnName = "apk_id")
    @JoinColumn(name = "apk_date", referencedColumnName = "apk_date")
    @JoinColumn(name = "apk_found_errors", referencedColumnName = "found_errors")
    @JoinColumn(name = "apk_status", referencedColumnName = "apk_status")
    @JoinColumn(name = "apk_price", referencedColumnName = "apk_price")
    private APK apk;

    @ManyToOne
    @MapsId("reperationId")
    @JoinColumn(name = "reperation_id")
    @JsonIgnoreProperties("reperation_apk")
    private Reperation reperation;

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

    public Reperation getReperation() {
        return reperation;
    }

    public void setReperation(Reperation reperation) {
        this.reperation = reperation;
    }
}
