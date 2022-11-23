package com.packages.tiendamascota.Models;

import javax.persistence.*;

@Entity
@Table(name = "Carrito")
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
