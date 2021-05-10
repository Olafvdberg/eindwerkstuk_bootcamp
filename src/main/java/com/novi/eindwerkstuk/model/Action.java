package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "actions")
public class Action implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long action_id;

    @Column(length = 80)
    private String action_name;

    @Column(length = 80)
    private float action_price;

    @Column(length = 80)
    private String action_used_name;

    @Column(length = 80)
    private float action_used_price;

    //constructor

    public Action() {

    }

    public Action(String action_name, float action_price, String action_used_name, float action_used_price) {
        this.action_name = action_name;
        this.action_price = action_price;
        this.action_used_name = action_used_name;
        this.action_used_price = action_used_price;
    }


    //getters and setters

    public long getAction_id() {
        return action_id;
    }

    public void setAction_id(long action_id) {
        this.action_id = action_id;
    }

    public String getAction_name() {
        return action_name;
    }

    public void setAction_name(String action_name) {
        this.action_name = action_name;
    }

    public float getAction_price() {
        return action_price;
    }

    public void setAction_price(float action_price) {
        this.action_price = action_price;
    }

    public String getAction_used_name() {
        return action_used_name;
    }

    public void setAction_used_name(String action_used_name) {
        this.action_used_name = action_used_name;
    }

    public float getAction_used_price() {
        return action_used_price;
    }

    public void setAction_used_price(float action_used_price) {
        this.action_used_price = action_used_price;
    }
}
