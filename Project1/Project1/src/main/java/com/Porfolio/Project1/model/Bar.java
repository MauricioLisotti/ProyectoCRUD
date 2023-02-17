package com.Porfolio.Project1.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Data
@Table(name = "bar")

public class Bar {
    @Autowired
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long idBar;

    @Column(name = "NOMBRE")
    String nombre;

    @Column(name = "TELEFONO")
    String telefono;

    @Column(name = "DIRECCION")
    String direccion;

}

