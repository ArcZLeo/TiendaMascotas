package com.tiendamascotas.Models;

import javax.persistence.*;

@Entity
@Table(name = "ProductoCategoria")
public class ProductoCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
