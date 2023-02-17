package com.Porfolio.Project1.service;

import com.Porfolio.Project1.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> findAllUsuarios();

    Optional<Usuario> findUsuarioById(Long id);

    Usuario saveUsuario(Usuario usuarioNew);

    String deleteUsuario(Long id);

    Usuario getUsuario(String username);

    String updateUsuario(Usuario usuarioNew);


}