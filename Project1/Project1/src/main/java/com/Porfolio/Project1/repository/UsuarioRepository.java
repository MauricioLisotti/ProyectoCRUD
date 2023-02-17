package com.Porfolio.Project1.repository;

import com.Porfolio.Project1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>, CrudRepository<Usuario, Long> {
    Void save(Optional<Usuario> usuarioToUpdate);
    Usuario findByUsername(String username);
}
