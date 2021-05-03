package com.novi.eindwerkstuk.model;

import javax.persistence.*;

@Entity
@Table (name = "actions")
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long action_id;

    @Column(length = 80)
    private String action_name;

    @Column(length = 80)
    private String action_price;

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

    public String getAction_price() {
        return action_price;
    }

    public void setAction_price(String action_price) {
        this.action_price = action_price;
    }
}
