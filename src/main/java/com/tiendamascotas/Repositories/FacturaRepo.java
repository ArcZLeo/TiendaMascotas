package com.tiendamascotas.Repositories;

import com.tiendamascotas.Models.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepo extends JpaRepository<Factura, Long> {
}
