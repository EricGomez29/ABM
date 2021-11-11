package com.abm.basico.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.basico.interfaceService.IUsuarioService;
import com.abm.basico.interfaces.IUsuario;
import com.abm.basico.model.Usuario;

@Service
public class UsuarioService implements IUsuarioService {
	
	@Autowired
	private IUsuario data;
	
	@Override
	public List<Usuario> listUsers() {
		// TODO Auto-generated method stub
		return (List<Usuario>)data.findAll();
	}

	@Override
	public Optional<Usuario> listId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Usuario user) {
		// TODO Auto-generated method stub
		int res = 0;
		Usuario u = data.save(user);
		if(!u.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
