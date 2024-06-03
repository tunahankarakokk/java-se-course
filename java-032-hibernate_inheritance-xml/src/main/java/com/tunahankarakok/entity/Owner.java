package com.tunahankarakok.entity;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Owner extends Person {

    private Long stocks;
    private Long partnershipStake;

    // Constructors and Getter/Setter methods,
}
