package com.crud_usuarios.CRUD.services;

import com.crud_usuarios.CRUD.models.usuario;
import com.crud_usuarios.CRUD.repositories.usuarioRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class usuarioServices {
    @Autowired
    usuarioRepositories usuarioRepositories;

    public ArrayList<usuario> obtenerUsuarios()
    {
        return (ArrayList<usuario>)usuarioRepositories.findAll();
    }
    public usuario guardarUsuario(usuario user)
    {
        return usuarioRepositories.save(user);
    }
    public Optional<usuario> obtenerPorId(Long id)
    {
        return usuarioRepositories.findById(id);
    }
    public ArrayList<usuario> obtenerPorPrioridad(Integer prioridad)
    {
        return usuarioRepositories.findByPrioridad(prioridad);
    }
    public boolean eliminarUsuario(Long id)
    {
        try {
            usuarioRepositories.deleteById(id);
            return true;
        }catch (Exception err)
        {
            return  false;
        }
    }
}
