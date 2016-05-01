package com.umu.arrui.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "arrui")
public class Arrui implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "genero")
	private String genero;

	@Column(name = "fecha_captura")
	private Date fechaCaptura;

	@Column(name = "fecha_recogida")
	private Date fechaRecogida;
	
	public Arrui() {
		super();
	}

	public Arrui(String name, String genero, Date fechaCaptura, Date fechaRecogida) {
		super();
		this.name = name;
		this.genero = genero;
		this.fechaCaptura = fechaCaptura;
		this.fechaRecogida = fechaRecogida;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
