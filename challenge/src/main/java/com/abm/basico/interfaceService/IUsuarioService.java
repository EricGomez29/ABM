package com.abm.basico.interfaceService;

import java.util.*;

import com.abm.basico.model.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> listUsers();
	public Optional<Usuario> listId(int id);
	public int save(Usuario user);
	public void delete(int id);
}
