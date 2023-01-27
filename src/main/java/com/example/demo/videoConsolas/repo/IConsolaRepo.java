package com.example.demo.videoConsolas.repo;

import com.example.demo.videoConsolas.modelo.Consola;

public interface IConsolaRepo {
	//CRUD
	
	public void insertar(Consola consola);
	public Consola seleccionar(Integer id);
	public Consola seleccionarTodos(Integer id);
	public void update(Consola consola);
	public void delete(Integer id);
}
