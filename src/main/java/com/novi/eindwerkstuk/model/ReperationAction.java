package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "reperation_action")
public class ReperationAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "reperation_id", referencedColumnName = "reperation_id")
    @JoinColumn(name = "reperation_date", referencedColumnName = "reperation_date")
    @JoinColumn(name = "reperation_status", referencedColumnName = "status")
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
