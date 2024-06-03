package com.tunahankarakok.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER_DETAILS")
public class CustomerDetail {

    @OneToOne
    @JoinColumn
    private Customer customer;


    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @org.hibernate.annotations.Parameter(name = "property", value = "customer")
    )
    @Column(name = "CUSTOMER_ID")

    private int customerId;
    // TODO @MapsId ile modernliştirilecek.
    // FIXME YAPILACAK


    private String adress;
    private String phoneNumber;
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "SUB_DATE")
    private Date createDate;

}


