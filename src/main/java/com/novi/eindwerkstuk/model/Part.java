package com.novi.eindwerkstuk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "parts")
public class Part {

    @Column(length = 80)
    private String part_name;

    @Column(length = 80)
    private String part_price;
}
