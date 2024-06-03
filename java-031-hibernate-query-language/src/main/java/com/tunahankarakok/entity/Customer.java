package com.tunahankarakok.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMERS")
public class Customer {


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

    @Column(name = "AGE", length = 55)
    private short age;

}


