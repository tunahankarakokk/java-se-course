package com.tunahankarakok.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @OneToMany(mappedBy = "customer",
            fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)


    private Set<Order> orders = new HashSet<Order>();





    // TODO MODERNLEŞTİRMEK İÇİN İNCELE

@OneToMany(mappedBy = "customer",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL)



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private int customerId;

    @Column(name = "FIRST_NAME", length = 50, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length = 55)
    private String lastName;

}


