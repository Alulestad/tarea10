package com.example.demo.videoConsolas.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.videoConsolas.modelo.Consola;
import com.example.demo.videoConsolas.repo.IConsolaRepo;

public interface IConsolaService {

	
	
	public void agregar(Consola consola);
	public Consola buscar(Integer id);
	public Consola buscarTodos(Integer id);
	public void actualizar(Consola consola);
	public void eliminar(Integer id);
}
