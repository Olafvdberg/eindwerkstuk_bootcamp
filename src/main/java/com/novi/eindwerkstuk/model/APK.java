package com.novi.eindwerkstuk.model;

import javax.persistence.*;

@Entity
@Table(name = "APK")
public class APK {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long apk_id;

    @Column(length = 80)
    private String apk_date;

    @Column(length = 80)
    private String apk_status;

    @Column(length = 80)
    private String found_errors;

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
}
