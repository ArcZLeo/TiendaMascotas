package com.tiendamascotas.Models;

import javax.persistence.*;

@Entity
@Table(name = "ProductoPrecio")
public class ProductoPrecio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double cantidad;

    @Column(nullable = true)
    private Double descuento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public ProductoPrecio(){}
    public ProductoPrecio(Long id, Double cantidad, Double descuento) {
        this.id = id;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }
}
