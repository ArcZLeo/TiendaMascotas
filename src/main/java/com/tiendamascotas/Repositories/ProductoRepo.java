package com.tiendamascotas.Repositories;

import com.tiendamascotas.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Producto, Long> {
}
