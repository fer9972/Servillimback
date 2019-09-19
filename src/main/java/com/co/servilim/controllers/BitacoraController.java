package com.co.servilim.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.servilim.entities.Bitacora;
import com.co.servilim.services.BitacoraService;

@RestController
public class BitacoraController {
	
	@Autowired
	private BitacoraService bitacoraService;
	
	@PostMapping("bitacora")
	public String saveBitacora(@RequestBody Bitacora bitacora) {
		bitacoraService.saveBitacora(bitacora);
		return "";
	}
	
	@PostMapping("bitacora/list")
	public String saveBitacora(@RequestBody ArrayList<Bitacora> bitacora) {
		
		bitacoraService.saveBitacora(bitacora);
		return "";
	}
	@PostMapping("bitacora/map")
	public String saveBitacora(@RequestBody Map< String, List<Bitacora>> mapa) {
		bitacoraService.saveBitacora(mapa);
		return "";
	}
	
	@DeleteMapping("bitacora/{id}")
	public String deleteBitacora(/*@RequestBody Bitacora bitacora*/) {
		
		return "Yo soy Sebas";
	}
	
	@PutMapping("bitacora")
	public String updateBitacora(@RequestBody Bitacora bitacora) {
		
		return "";
	}
	
	@GetMapping("bitacora/{id}")
	public Bitacora findBitacoraById(@PathVariable Long id) {
		
		return bitacoraService.getBitacora(id);
	}
	
	@GetMapping("bitacora")
	public Iterable<Bitacora> getBitacora() {
		return bitacoraService.findAll();
	}
	
}	
