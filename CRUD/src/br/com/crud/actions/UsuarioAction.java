package br.com.crud.actions;

import java.util.List;

import br.com.crud.factory.RepositoryFactory;
import br.com.crud.factory.UsuarioRepositoryFactory;
import br.com.crud.model.Repository;
import br.com.crud.model.Usuario;
import br.com.crud.model.UsuarioRepository;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UsuarioAction extends ActionSupport
{
	private Usuario usuario = new Usuario();
	private RepositoryFactory factory = new UsuarioRepositoryFactory();
	
	private List<Usuario> usuarios;
	
	public Usuario getUsuario() 
	{
		return usuario;
	}

	public List<Usuario> getUsuarios() 
	{
		return usuarios;
	}

	public String adicionaOuAltera()
	{
		Repository repository = this.factory.criarRepository();
		
		if(this.usuario.getId() == null)
		{
			repository.adiciona(this.usuario);
		}
		else
		{
			repository.altera(this.usuario);
		}
		
		this.usuario = new Usuario();
		
		return UsuarioAction.SUCCESS;
	}
	
	public String remove()
	{
		Repository repository = this.factory.criarRepository();
		repository = new UsuarioRepository();
		repository.remove(this.usuario.getId());
		this.usuario = new Usuario();
		return UsuarioAction.SUCCESS;
	}
	
	public String preparaAlteracao()
	{
		Repository repository = this.factory.criarRepository();
		this.usuario = repository.busca(this.usuario.getId());
		return UsuarioAction.SUCCESS;
	}
	
	public String lista()
	{
		Repository repository = this.factory.criarRepository();
		this.usuarios = repository.lista();
		return UsuarioAction.SUCCESS;
	}
	
}
