package com.packages.tiendamascota.Repositories;

import com.packages.tiendamascota.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Producto, Long> {
}
