package br.com.crud.model;

import java.util.List;

public interface Repository 
{

	public abstract void adiciona(Usuario usuario);

	public abstract void altera(Usuario usuario);

	public abstract void remove(int id);

	public abstract Usuario busca(int id);

	public abstract List<Usuario> lista();
	
}
