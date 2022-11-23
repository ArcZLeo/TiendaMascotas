package com.packages.tiendamascota.Repositories;

import com.packages.tiendamascota.Models.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepo extends JpaRepository<Factura, Long> {
}
