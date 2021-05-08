package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "actions")
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long action_id;

    @Column(length = 80)
    private String action_name;

    @Column(length = 80)
    private float action_price;

    @OneToMany(mappedBy = "action")
    @JsonIgnoreProperties("action")
    List<ReperationAction> reperation_action;

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

    public List<ReperationAction> getReperation_action() {
        return reperation_action;
    }

    public void setReperation_action(List<ReperationAction> reperation_action) {
        this.reperation_action = reperation_action;
    }
}
