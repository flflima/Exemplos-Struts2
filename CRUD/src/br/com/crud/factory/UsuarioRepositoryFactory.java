package br.com.crud.factory;

import br.com.crud.model.Repository;
import br.com.crud.model.UsuarioRepository;

public class UsuarioRepositoryFactory implements RepositoryFactory 
{
	
	@Override
	public Repository criarRepository() 
	{
		return new UsuarioRepository();
	}

}
