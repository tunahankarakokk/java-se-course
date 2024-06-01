package com.tunahankarakok.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;


import java.util.Date;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "WORKERS")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "F_NAME")
    private String firstName;

    @NotNull
    @Column(name = "L_NAME")
    private String lastname;

    @Size(min = 18 , max =99)
    @Column(name = "AGE")
    private int age;

    @Column(unique = true,name = "EMAIL",nullable = false)
    private String email;


    @Column(name = "PHONE")
    private String phone;

    @FutureOrPresent
    @Temporal(TemporalType.DATE)
    @Column(name= "DATE_CREATE")
    private Date createDate;

    @Embedded
    private Adress adress;
}
