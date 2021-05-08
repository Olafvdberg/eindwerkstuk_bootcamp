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
}
