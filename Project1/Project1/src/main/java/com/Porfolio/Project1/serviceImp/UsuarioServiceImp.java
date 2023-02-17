package com.Porfolio.Project1.serviceImp;


import com.Porfolio.Project1.model.Usuario;
import com.Porfolio.Project1.repository.UsuarioRepository;
import com.Porfolio.Project1.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findUsuarioById(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario;
    }
    @Override
    public Usuario getUsuario(String username){
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public Usuario saveUsuario(Usuario usuarioNew) {
        if (usuarioNew != null) {
            return usuarioRepository.save(usuarioNew);
        }
        return new Usuario();
    }

    @Override
    public String deleteUsuario(Long id) {
        if (usuarioRepository.findById(id).isPresent()) {
            usuarioRepository.deleteById(id);
            return "Usuario eliminado correctamente.";
        }
        return "Error! El usuario no existe";
    }

    @Override
    public String updateUsuario(Usuario usuarioUpdated) {
        Long num = usuarioUpdated.getId();
        if (usuarioRepository.findById(num).isPresent()) {
            Usuario usuarioToUpdate = new Usuario();
            usuarioToUpdate.setId(usuarioUpdated.getId());
            usuarioToUpdate.setUsername(usuarioUpdated.getUsername());
            usuarioToUpdate.setPassword(usuarioUpdated.getPassword());
            usuarioToUpdate.setNombre(usuarioUpdated.getNombre());
            usuarioToUpdate.setApellido(usuarioUpdated.getApellido());
            usuarioToUpdate.setCorreo(usuarioUpdated.getCorreo());

            usuarioRepository.save(usuarioToUpdate);
            return "Usuario modificado";
        }
        return "Error al modificar el usuario.";
    }

}
