package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "part_stock")
public class PartStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @MapsId("stockId")
    @JoinColumn(name = "stock_id")
    @JsonIgnoreProperties("part_stock")
    private Stock stock;

    @ManyToOne
    @MapsId("partId")
    @JoinColumn(name = "part_id")
    @JsonIgnoreProperties("part_stock")
    private Part part;

    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }
}
