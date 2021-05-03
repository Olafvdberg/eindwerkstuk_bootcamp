package com.novi.eindwerkstuk.model;

import javax.persistence.*;

@Entity
@Table(name = "mechanics")
public class Mechanic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mechanic_id;

    @Column(length = 80)
    private String first_name;

    @Column(length = 80)
    private String last_name;

    //getters and setters

    public long getMechanic_id() {
        return mechanic_id;
    }

    public void setMechanic_id(long mechanic_id) {
        this.mechanic_id = mechanic_id;
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
}
