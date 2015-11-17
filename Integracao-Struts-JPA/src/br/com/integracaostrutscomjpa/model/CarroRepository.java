package br.com.integracaostrutscomjpa.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CarroRepository 
{
	private EntityManager manager;

	public CarroRepository(EntityManager manager) 
	{
		this.manager = manager;
	}

	public void adiciona(Carro carro)
	{
		this.manager.persist(carro);
	}
	
	@SuppressWarnings("unchecked")
	public List<Carro> buscaTodos()
	{
		Query query = this.manager.createQuery("SELECT c FROM Carro c");
		return query.getResultList();
	}
}
