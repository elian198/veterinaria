package com.veterinaria.entities;

import com.veterinaria.entities.enums.Description;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ROLES")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRPTION")
    private Description description;


    public Role() { }


}
