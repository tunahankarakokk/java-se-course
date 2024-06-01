package com.tunahankarakok.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Adress {
    @Column(name = "COUNTRY")
    private String country;
    private String city;
    private String state;
    @Column (name = "ZIP")
    private String zip;



}
