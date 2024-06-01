package com.tunahankarakok.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMERS")
public class Customer {





    // TODO MODERNLEŞTİRMEK İÇİN İNCELE

@OneToOne(mappedBy = "customer",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL)
private CustomerDetail customerDetail;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private int customerId;

    @Column(name = "FIRST_NAME", length = 50, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length = 55)
    private String lastName;

}


