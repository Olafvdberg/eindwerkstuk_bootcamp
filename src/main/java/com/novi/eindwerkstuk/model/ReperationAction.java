package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "reperation_action")
public class ReperationAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @MapsId("reperationId")
    @JoinColumn(name = "reperation_id")
    @JsonIgnoreProperties("reperation_action")
    private Reperation reperation;

    @ManyToOne
    @MapsId("actionId")
    @JoinColumn(name = "action_id")
    @JsonIgnoreProperties("reperation_action")
    private Action action;

    @Column
    private String used_action;

    @Column
    private float price_used_action;

    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Reperation getReperation() {
        return reperation;
    }

    public void setReperation(Reperation reperation) {
        this.reperation = reperation;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public String getUsed_action() {
        return used_action;
    }

    public void setUsed_action(String used_action) {
        this.used_action = used_action;
    }

    public float getPrice_used_action() {
        return price_used_action;
    }

    public void setPrice_used_action(float price_used_action) {
        this.price_used_action = price_used_action;
    }
}
