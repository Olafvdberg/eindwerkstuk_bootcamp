package com.novi.eindwerkstuk.model;

import javax.persistence.*;

@Entity
@Table(name = "parts")
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long part_id;

    @Column(length = 80)
    private String part_name;

    @Column(length = 80)
    private String part_price;

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

    public String getPart_price() {
        return part_price;
    }

    public void setPart_price(String part_price) {
        this.part_price = part_price;
    }
}
