package com.co.servilim.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Bitacora implements Serializable {
	
	private static final long serialVersionUID = -8947189276493282565L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date fecha;

	private String comentario;
	
	private String serial;
	
	private Long id_usuario;

	public Bitacora(Long id, Date date, String comentario, String serial, Long id_usuario) {
		super();
		this.id = id;
		this.fecha = date;
		this.comentario = comentario;
		this.serial = serial;
		this.id_usuario = id_usuario;
	}
	
	public Bitacora() {
		
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}
}
