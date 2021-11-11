package com.abm.basico.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abm.basico.model.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
