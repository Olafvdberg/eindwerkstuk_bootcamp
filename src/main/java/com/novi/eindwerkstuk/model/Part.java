package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "parts")
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long part_id;

    @Column(length = 80)
    private String part_name;

    @Column(length = 80)
    private float part_price;

    @Column(length = 80)
    private String part_used_name;

    @Column(length = 80)
    private float part_price_name;

    @OneToMany(mappedBy = "part")
    @JsonIgnoreProperties("part")
    List<ReperationPart> reperation_part;

    @OneToMany(mappedBy = "part")
    @JsonIgnoreProperties("part")
    List<PartStock> part_stock;

    //getters and setters

    public long getPart_id() {
        return part_id;
    }

    public void setPart_id(long part_id) {
        this.part_id = part_id;
    }

    public String getPart_name() {
        return part_name;
    }

    public void setPart_name(String part_name) {
        this.part_name = part_name;
    }

    public float getPart_price() {
        return part_price;
    }

    public void setPart_price(float part_price) {
        this.part_price = part_price;
    }

    public List<ReperationPart> getReperation_part() {
        return reperation_part;
    }

    public void setReperation_part(List<ReperationPart> reperation_part) {
        this.reperation_part = reperation_part;
    }

    public List<PartStock> getPart_stock() {
        return part_stock;
    }

    public void setPart_stock(List<PartStock> part_stock) {
        this.part_stock = part_stock;
    }
}
