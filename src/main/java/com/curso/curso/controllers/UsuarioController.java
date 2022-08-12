package com.curso.curso.controllers;

import com.curso.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id)
    {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Julio");
        usuario.setApellido("Castellanos");
        usuario.setEmail("jucesarcas88@gmail.com");
        usuario.setTelefono("3104692414");
        return usuario;
    }

    @RequestMapping(value="usuario/23")
    public Usuario editar()
    {
        Usuario usuario = new Usuario();
        usuario.setNombre("Julio");
        usuario.setApellido("Castellanos");
        usuario.setEmail("jucesarcas88@gmail.com");
        usuario.setTelefono("3104692414");
        return usuario;
    }

    @RequestMapping(value="usuario/24")
    public Usuario eliminar()
    {
        Usuario usuario = new Usuario();
        usuario.setNombre("Julio");
        usuario.setApellido("Castellanos");
        usuario.setEmail("jucesarcas88@gmail.com");
        usuario.setTelefono("3104692414");
        return usuario;
    }

    @RequestMapping(value="usuario/25")
    public Usuario buscar()
    {
        Usuario usuario = new Usuario();
        usuario.setNombre("Julio");
        usuario.setApellido("Castellanos");
        usuario.setEmail("jucesarcas88@gmail.com");
        usuario.setTelefono("3104692414");
        return usuario;
    }
}
