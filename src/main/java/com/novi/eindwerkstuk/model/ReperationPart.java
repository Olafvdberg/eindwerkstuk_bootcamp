package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table (name = "reperation_part")
public class ReperationPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @MapsId("reperationId")
    @JoinColumn(name = "reperation_id")
    @JsonIgnoreProperties("reperation_part")
    private Reperation reperation;

    @ManyToOne
    @MapsId("partId")
    @JoinColumn(name = "part_id")
    @JsonIgnoreProperties("reperation_part")
    private Part part;

    @Column
    private String used_part;

    @Column
    private float price_used_part;

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

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public String getUsed_part() {
        return used_part;
    }

    public void setUsed_part(String used_part) {
        this.used_part = used_part;
    }

    public float getPrice_used_part() {
        return price_used_part;
    }

    public void setPrice_used_part(float price_used_part) {
        this.price_used_part = price_used_part;
    }
}
