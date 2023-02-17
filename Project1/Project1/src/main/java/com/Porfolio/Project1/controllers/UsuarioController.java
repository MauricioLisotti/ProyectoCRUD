package com.Porfolio.Project1.controllers;

import com.Porfolio.Project1.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioController {

    public List<Usuario> getUsuario();

    public Optional<Usuario> getUsuarioById(Long id);

    public Usuario findByUsername(String username);

    public Usuario addUsuario(Usuario usuario);

    public String deleteUsuario(Long id);

    public String updateUsuario(Usuario usuarioNew);

    public String test();

}
