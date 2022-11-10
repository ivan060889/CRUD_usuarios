package com.crud_usuarios.CRUD.repositories;

import com.crud_usuarios.CRUD.models.usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

//IMPLEMENTAMOS REPOSITORIO DND VAN A ESTAR LOS METODOS
//HACE CONEXION CON BD
@Repository
public interface usuarioRepositories extends CrudRepository<usuario, Long> {
    public abstract ArrayList<usuario> findByPrioridad(Integer prioridad);

}
