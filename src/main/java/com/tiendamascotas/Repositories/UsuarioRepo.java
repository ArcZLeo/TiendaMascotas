package com.packages.tiendamascota.Repositories;

import com.packages.tiendamascota.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
