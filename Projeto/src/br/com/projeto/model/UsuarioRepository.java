package br.com.projeto.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UsuarioRepository 
{
	private EntityManager manager;

	public UsuarioRepository(EntityManager manager) 
	{
		super();
		this.manager = manager;
	}
	
	public Usuario busca(Integer id)
	{
		return this.manager.find(Usuario.class, id);
	}
	
	public void adiciona(Usuario usuario)
	{
		this.manager.persist(usuario);
	}
	
	public void remove(Integer id)
	{
		Usuario usuario = this.manager.find(Usuario.class, id);
		this.manager.remove(usuario);
	}
	
	public void altera(Usuario usuario)
	{
		this.manager.merge(usuario);
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> lista()
	{
		Query query = this.manager.createQuery("SELECT u FROM Usuario u");
		return query.getResultList();
	}
	
	public boolean existeUsernameEPassword(String username, String password)
	{
		Query query = this.manager.createQuery("SELECT u FROM Usuario u WHERE u.username = :username and u.password = :password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		
		return !query.getResultList().isEmpty();
	}
}
