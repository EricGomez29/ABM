package com.abm.basico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abm.basico.model.Usuario;
import com.abm.basico.service.UsuarioService;

@Controller
@RequestMapping
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/list")
	public String listUser(Model model) {
		
		List<Usuario> usuarios = service.listUsers();
		model.addAttribute("usuarios", usuarios);
		
		return "index";
	}
	
	@GetMapping("/new")
	public String addUser(Model model) {
		
		model.addAttribute("usuario", new Usuario());
		return "form";
	}
	
	@PostMapping("/save")
	public String saveUser(@Validated Usuario user, Model model) {
		
		service.save(user);
		return "redirect:/list";
	}
}
