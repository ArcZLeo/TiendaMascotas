package com.packages.tiendamascota.Repositories;

import com.packages.tiendamascota.Models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepo extends JpaRepository<Pedido, Long> {
}
