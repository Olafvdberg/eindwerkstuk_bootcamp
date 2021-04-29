package com.novi.eindwerkstuk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "reperations")
public class Reperation {

    @Column(length = 80)
    private String reperation_date;

    @Column(length = 80)
    private String to_do_reperation;
}
