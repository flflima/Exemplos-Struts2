package br.com.crud.actions;

import java.util.List;

import br.com.crud.model.Usuario;
import br.com.crud.model.UsuarioRepository;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UsuarioAction extends ActionSupport
{
	private Usuario usuario = new Usuario();
	
	private List<Usuario> usuarios;
	
	public String adicionaOuAltera()
	{
		UsuarioRepository repository = new UsuarioRepository();
		
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
}
