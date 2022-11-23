package com.tiendamascotas.Models;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private ProductoCategoria categoria;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "precio_id", referencedColumnName = "id")
    private ProductoPrecio precio;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private String detalle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ProductoCategoria categoria) {
        this.categoria = categoria;
    }

    public ProductoPrecio getPrecio() {
        return precio;
    }

    public void setPrecio(ProductoPrecio precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Producto(){}
    public Producto(Long id, ProductoCategoria categoria, ProductoPrecio precio, String nombre, Integer cantidad, String detalle) {
        this.id = id;
        this.categoria = categoria;
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.detalle = detalle;
    }
}
