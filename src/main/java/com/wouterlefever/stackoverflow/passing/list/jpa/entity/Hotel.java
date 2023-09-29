package com.wouterlefever.stackoverflow.passing.list.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "TDK_SEC_HOTEL_RIGHT")
public class Hotel {

    @Id
    private String ID_RIGHT;
    private String name;

    public Hotel() {
    }

    public Hotel(String ID_RIGHT, String name) {
        this.ID_RIGHT = ID_RIGHT;
        this.name = name;
    }


}
