package com.example.demo.videoConsolas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.videoConsolas.modelo.Consola;
import com.example.demo.videoConsolas.repo.IConsolaRepo;

@Service
public class ConsolaServiceImpl implements IConsolaService {

	@Autowired
	private IConsolaRepo consolaRepo;
	
	@Override
	public void agregar(Consola consola) {
		this.consolaRepo.insertar(consola);

	}

	@Override
	public Consola buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.consolaRepo.seleccionar(id);
	}

	@Override
	public Consola buscarTodos(Integer id) {
		// TODO Auto-generated method stub
		return this.consolaRepo.seleccionarTodos(id);
	}

	@Override
	public void actualizar(Consola consola) {
		// TODO Auto-generated method stub
		this.consolaRepo.update(consola);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.consolaRepo.delete(id);
	}

}
