package com.novi.eindwerkstuk.model;

import javax.persistence.*;

@Entity
@Table(name = "bon")
public class Bon {
    @Id
    @GeneratedValue
    private long id;

    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
