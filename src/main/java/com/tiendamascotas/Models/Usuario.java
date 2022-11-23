package com.tiendamascotas.Models;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellidoM;

    @Column(nullable = false)
    private String apellidoP;

    @Column(nullable = false)
    private Integer edad;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = true,columnDefinition = "Boolean default false")
    private Boolean privilegios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(Boolean privilegios) {
        this.privilegios = privilegios;
    }

    public Usuario(){}

    public Usuario(Long id, String nombre, String apellidoM, String apellidoP, Integer edad, String email, String direccion, Boolean privilegios) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoM = apellidoM;
        this.apellidoP = apellidoP;
        this.edad = edad;
        this.email = email;
        this.direccion = direccion;
        this.privilegios = privilegios;
    }
}
