package com.trilochan.micronaut.shop.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
    private UUID id;

    @NotNull
    @Column
    private String name;

    @NotNull
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotNull
    @Column(name = "roll_number", unique = true)
    private String rollNumber;

    @NotNull
    @Column
    private String institution;

}
