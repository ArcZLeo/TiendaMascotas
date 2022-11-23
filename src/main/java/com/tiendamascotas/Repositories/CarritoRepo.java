package com.packages.tiendamascota.Repositories;

import com.packages.tiendamascota.Models.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoRepo extends JpaRepository<Carrito, Long> {
}
