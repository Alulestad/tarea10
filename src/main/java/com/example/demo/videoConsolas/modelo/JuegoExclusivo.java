package com.example.demo.videoConsolas.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "juegoExclusivo")
public class JuegoExclusivo {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_juex")
	@SequenceGenerator(name = "seq_juex",sequenceName = "seq_juex",allocationSize = 1)
	@Column(name = "juex_id")
	private Integer id;
	@Column(name = "juex_nombre")
	private String nombre;
	@Column(name = "juex_precio")
	private BigDecimal precio;
	
	@ManyToOne
	//(cascade = CascadeType.ALL)
	@JoinColumn(name = "juex_id_consola")
	private Consola consola;

	//Gets y sets
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Consola getConsola() {
		return consola;
	}

	public void setConsola(Consola consola) {
		this.consola = consola;
	}

	@Override
	public String toString() {
		return "JuegoExclusivo [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
}
