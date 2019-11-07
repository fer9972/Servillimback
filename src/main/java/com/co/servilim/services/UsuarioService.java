package com.co.servilim.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.servilim.entities.Usuario;
import com.co.servilim.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Iterable<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
}
