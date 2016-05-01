package com.umu.arrui.service.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Arrui
 * @author David
 *
 */
public class ArruiSrvDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6569151894096922794L;

	private Integer id;

	private String name;

	private String genero;

	private Date fechaCaptura;

	private Date fechaRecogida;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getFechaCaptura() {
		return fechaCaptura;
	}

	public void setFechaCaptura(Date fechaCaptura) {
		this.fechaCaptura = fechaCaptura;
	}

	public Date getFechaRecogida() {
		return fechaRecogida;
	}

	public void setFechaRecogida(Date fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}
	
}
