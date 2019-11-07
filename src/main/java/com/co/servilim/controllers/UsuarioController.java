package com.co.servilim.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.servilim.entities.Usuario;
import com.co.servilim.services.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("Usuarios")
	public Iterable<Usuario> getUsuario() {
		return usuarioService.findAll();
	}
}
