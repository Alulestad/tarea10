package com.example.demo.videoConsolas.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.videoConsolas.modelo.Consola;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ConsolaRepoImpl implements IConsolaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Consola consola) {
		this.entityManager.persist(consola);

	}

	@Override
	public Consola seleccionar(Integer id) {
		Consola encontrado=this.entityManager.find(Consola.class, id);
		return encontrado;
	}
	
	@Override
	public Consola seleccionarTodos(Integer id) {
		Consola encontrado=this.entityManager.find(Consola.class, id);
		encontrado.getExclusivos().size();
		return encontrado;
	}

	@Override
	public void update(Consola consola) {
		this.entityManager.merge(consola);

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Consola aEliminar=this.seleccionar(id);
		this.entityManager.remove(aEliminar);
	}
	
	
}
