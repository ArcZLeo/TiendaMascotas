package com.packages.tiendamascota.Models;

import javax.persistence.*;

@Entity
@Table(name = "Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
