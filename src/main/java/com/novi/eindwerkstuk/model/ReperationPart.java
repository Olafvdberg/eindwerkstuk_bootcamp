package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table (name = "reperation_part")
public class ReperationPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "reperation_id", referencedColumnName = "reperation_id")
    @JoinColumn(name = "reperation_date", referencedColumnName = "reperation_date")
    @JoinColumn(name = "reperation_status", referencedColumnName = "status")
    private Reperation reperation;

    @ManyToOne
    @MapsId("partId")
    @JoinColumn(name = "part_id")
    @JsonIgnoreProperties("reperation_part")
    private Part part;

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
}
