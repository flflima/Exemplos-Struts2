package br.com.crud.model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository implements Repository
{
	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	@Override
	public Usuario busca(int id)
	{
		return UsuarioRepository.usuarios.get(id - 1);
	}
	
	@Override
	public void adiciona(Usuario usuario)
	{
		usuario.setId(UsuarioRepository.usuarios.size() + 1);
		UsuarioRepository.usuarios.add(usuario);
	}
	
	@Override
	public void remove(int id)
	{
		UsuarioRepository.usuarios.remove(id - 1);
	}
	
	@Override
	public void altera(Usuario usuario)
	{
		UsuarioRepository.usuarios.set(usuario.getId() - 1, usuario);
	}
	
	@Override
	public List<Usuario> lista()
	{
		return new ArrayList<Usuario>(UsuarioRepository.usuarios);
	}
}
