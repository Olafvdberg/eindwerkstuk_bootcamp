package com.novi.eindwerkstuk.model;

import javax.persistence.*;

@Entity
@Table (name = "reperations")
public class Reperation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reperation_id;

    @Column(length = 80)
    private String reperation_date;

    @Column(length = 80)
    private String to_do_reperation;

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

    public String getTo_do_reperation() {
        return to_do_reperation;
    }

    public void setTo_do_reperation(String to_do_reperation) {
        this.to_do_reperation = to_do_reperation;
    }
}
