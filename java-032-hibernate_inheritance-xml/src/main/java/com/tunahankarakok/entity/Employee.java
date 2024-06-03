package com.tunahankarakok.entity;

import lombok.*;
import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor




public class Employee extends Person {

    private Date joiningDate;
    private String departmentName;

    // Constructors and Getter/Setter methods,
}
