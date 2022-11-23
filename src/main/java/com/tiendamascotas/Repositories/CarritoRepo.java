package com.tiendamascotas.Repositories;


import com.tiendamascotas.Models.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoRepo extends JpaRepository<Carrito, Long> {
}
