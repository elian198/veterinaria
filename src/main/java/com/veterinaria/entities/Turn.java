package com.veterinaria.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "TURNS")
public class Turn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "LOCAL_TIME")
    private LocalDateTime localDateTime;

    @Column(name = "PRICE")
    private Double price;

    @JsonIgnore
    @ManyToOne
    private Customer customer;

    public Turn() { }
}
