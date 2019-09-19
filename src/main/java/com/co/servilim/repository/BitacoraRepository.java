package com.co.servilim.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.servilim.entities.Bitacora;


public interface BitacoraRepository extends CrudRepository<Bitacora, Long>{
	
}
