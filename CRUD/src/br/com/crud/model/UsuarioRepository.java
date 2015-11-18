package br.com.crud.model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository 
{
	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public Usuario busca(int id)
	{
		return UsuarioRepository.usuarios.get(id - 1);
	}
	
	public void adiciona(Usuario usuario)
	{
		usuario.setId(UsuarioRepository.usuarios.size() + 1);
		UsuarioRepository.usuarios.add(usuario);
	}
	
	public void remove(int id)
	{
		UsuarioRepository.usuarios.remove(id - 1);
	}
	
	public void altera(Usuario usuario)
	{
		UsuarioRepository.usuarios.set(usuario.getId() - 1, usuario);
	}
	
	public List<Usuario> lista()
	{
		return new ArrayList<Usuario>(UsuarioRepository.usuarios);
	}
}
