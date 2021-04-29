package com.novi.eindwerkstuk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "actions")
public class Action {

    @Column(length = 80)
    private String action_name;

    @Column(length = 80)
    private String action_price;
}
