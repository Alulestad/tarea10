package com.example.demo.videoConsolas.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "consola")
public class Consola {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_consola")
	@SequenceGenerator(name = "seq_consola",sequenceName = "seq_consola",allocationSize = 1)
	@Column(name = "consola_id")
	private Integer id;
	@Column(name = "consola_nombre")
	private String nombre;
	@Column(name = "consola_anioLanzamiento")
	private Integer anioLanzamiento;
	
	@OneToMany(mappedBy = "consola",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List <JuegoExclusivo> exclusivos;

	
	//Gets y Sets
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

	public Integer getAnioLanzamiento() {
		return anioLanzamiento;
	}

	public void setAnioLanzamiento(Integer anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}

	public List<JuegoExclusivo> getExclusivos() {
		return exclusivos;
	}

	public void setExclusivos(List<JuegoExclusivo> exclusivos) {
		this.exclusivos = exclusivos;
	}

	@Override
	public String toString() {
		return "Consola [id=" + id + ", nombre=" + nombre + ", anioLanzamiento=" + anioLanzamiento  +"]";
	}


	
	
	
}
