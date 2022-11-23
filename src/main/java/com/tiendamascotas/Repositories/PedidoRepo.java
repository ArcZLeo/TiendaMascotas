package com.tiendamascotas.Repositories;


import com.tiendamascotas.Models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepo extends JpaRepository<Pedido, Long> {
}
