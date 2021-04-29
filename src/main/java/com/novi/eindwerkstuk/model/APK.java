package com.novi.eindwerkstuk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "APK")
public class APK {

    @Column(length = 80)
    private String apk_date;

    @Column(length = 80)
    private String apk_status;

    @Column(length = 80)
    private String found_errors;

    //getters and setters

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
