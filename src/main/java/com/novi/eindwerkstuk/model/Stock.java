package com.novi.eindwerkstuk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stock_id;

    @Column(length = 80)
    private String part_name_stock;

    @Column(length = 80)
    private float part_price_stock;

    @Column(length = 80)
    private int amount_in_stock;

    @OneToMany(mappedBy = "stock")
    @JsonIgnoreProperties("stock")
    List<PartStock> part_stock;

    //constructor

    public Stock(String part_name_stock, float part_price_stock, int amount_in_stock) {
        this.part_name_stock = part_name_stock;
        this.part_price_stock = part_price_stock;
        this.amount_in_stock = amount_in_stock;
    }


    //getters and setters

    public long getStock_id() {
        return stock_id;
    }

    public void setStock_id(long stock_id) {
        this.stock_id = stock_id;
    }

    public String getPart_name_stock() {
        return part_name_stock;
    }

    public void setPart_name_stock(String part_name_stock) {
        this.part_name_stock = part_name_stock;
    }

    public float getPart_price_stock() {
        return part_price_stock;
    }

    public void setPart_price_stock(float part_price_stock) {
        this.part_price_stock = part_price_stock;
    }

    public int getAmount_in_stock() {
        return amount_in_stock;
    }

    public void setAmount_in_stock(int amount_in_stock) {
        this.amount_in_stock = amount_in_stock;
    }

    public List<PartStock> getPart_stock() {
        return part_stock;
    }

    public void setPart_stock(List<PartStock> part_stock) {
        this.part_stock = part_stock;
    }
}
