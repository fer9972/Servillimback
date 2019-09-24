package com.co.servilim.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.servilim.entities.Bitacora;
import com.co.servilim.repository.BitacoraRepository;

@Service
public class BitacoraService {

	@Autowired
	private BitacoraRepository bitacoraRepository;
	
	public Bitacora getBitacora(Long id) {
		
		Optional<Bitacora> optional = bitacoraRepository.findById(id);
		Bitacora bitacora;
		if(optional.isPresent()) {
			bitacora = optional.get();
		}else {
			bitacora = null;
		}
		return bitacora;
	}
		
	public Boolean saveBitacora(List<Bitacora> mapa) {
		mapa.forEach(b->{bitacoraRepository.save(b);});
		return Boolean.TRUE;
	}
	
	public void saveBitacora(Map<String, List<Bitacora>> mapa) {
		List<Bitacora> bitacora = mapa.get("Mapa");
		bitacora.forEach(b->{bitacoraRepository.save(b);});	
	}
	
	public Bitacora saveBitacora(Bitacora bitacora) {
		return bitacoraRepository.save(bitacora);
	}
	
	public Iterable<Bitacora> findAll() {
		return bitacoraRepository.findAll();
	}
}
