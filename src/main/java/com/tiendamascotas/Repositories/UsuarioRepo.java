package com.tiendamascotas.Repositories;


import com.tiendamascotas.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
