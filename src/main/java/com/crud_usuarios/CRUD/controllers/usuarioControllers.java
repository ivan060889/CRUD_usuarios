package com.crud_usuarios.CRUD.controllers;

import com.crud_usuarios.CRUD.models.usuario;
import com.crud_usuarios.CRUD.services.usuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class usuarioControllers {
    @Autowired
    usuarioServices usuarioServices;

    @GetMapping()
    public ArrayList<usuario> obtenerUsuarios()
    {
        return usuarioServices.obtenerUsuarios();
    }
    @PostMapping()
    public usuario guardarUsuario(@RequestBody usuario usuario)
    {
        return this.usuarioServices.guardarUsuario(usuario);
    }
    @GetMapping(path = "/{id}")
    public Optional<usuario> obtenerUsuarioPorId(@PathVariable("id")Long id)
    {
        return this.usuarioServices.obtenerPorId(id);
    }
    @GetMapping("/query")
    public ArrayList<usuario> ObtenerUsaruioPorPrioridad(@RequestParam("prioridad")Integer prioridad)
    {
        return this.usuarioServices.obtenerPorPrioridad(prioridad);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id")Long id)
    {
        boolean result=this.usuarioServices.eliminarUsuario(id);
        if (result)
        {
            return "USUARIO ELIMINADO CON ID " +id;
        }else
        {
            return "NO SE PUDO ELIMINAR EL USUARIO "+id;
        }
    }


}
