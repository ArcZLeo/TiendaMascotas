package com.packages.tiendamascota.Models;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
