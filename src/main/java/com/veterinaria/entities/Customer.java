package com.veterinaria.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private Integer phone;

    @Column(name = "STATE")
    private Boolean state;

    @OneToMany(cascade = {CascadeType.ALL},mappedBy="customer")
    private Set<Turn> accounts =new HashSet();

    public Customer() { }

}

