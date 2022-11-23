package com.packages.tiendamascota.Models;

import javax.persistence.*;

@Entity
@Table(name = "ProductoPrecio")
public class ProductoPrecio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
