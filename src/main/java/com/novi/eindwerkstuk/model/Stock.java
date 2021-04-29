package com.novi.eindwerkstuk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "stock")
public class Stock {

    @Column(length = 80)
    private String part_name_stock;

    @Column(length = 80)
    private String part_price_stock;

    @Column(length = 80)
    private int amount_in_stock;

    //getters and setters

    public String getPart_name_stock() {
        return part_name_stock;
    }

    public void setPart_name_stock(String part_name_stock) {
        this.part_name_stock = part_name_stock;
    }

    public String getPart_price_stock() {
        return part_price_stock;
    }

    public void setPart_price_stock(String part_price_stock) {
        this.part_price_stock = part_price_stock;
    }

    public int getAmount_in_stock() {
        return amount_in_stock;
    }

    public void setAmount_in_stock(int amount_in_stock) {
        this.amount_in_stock = amount_in_stock;
    }
}
