package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "reperations")
public class Reperation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reperation_id;

    @Column(length = 80)
    private String reperation_date;

    @Column(length = 80)
    private String status;

    @OneToMany(mappedBy = "reperation")
    @JsonIgnoreProperties("reperation")
    List<ReperationAPK> reperation_apk;

    //contructor

    public Reperation(String reperation_date, String status) {
        this.reperation_date = reperation_date;
        this.status = status;
    }


    //getters and setters

    public long getReperation_id() {
        return reperation_id;
    }

    public void setReperation_id(long reperation_id) {
        this.reperation_id = reperation_id;
    }

    public String getReperation_date() {
        return reperation_date;
    }

    public void setReperation_date(String reperation_date) {
        this.reperation_date = reperation_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String to_do_reperation) {
        this.status = to_do_reperation;
    }

    public List<ReperationAPK> getReperation_apk() {
        return reperation_apk;
    }

    public void setReperation_apk(List<ReperationAPK> apk_reperation) {
        this.reperation_apk = apk_reperation;
    }

}
