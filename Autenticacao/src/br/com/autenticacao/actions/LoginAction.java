package br.com.autenticacao.actions;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport 
{
	private static Map<String, String> mapa = new HashMap<String, String>();
	
	private String usuario;
	private String senha;
	private String mensagem;
	
	static
	{
		LoginAction.mapa.put("fulano", "fulano");
		LoginAction.mapa.put("sicrano", "sicrano");
	}

	public String getUsuario() 
	{
		return usuario;
	}

	public void setUsuario(String usuario) 
	{
		this.usuario = usuario;
	}

	public String getSenha() 
	{
		return senha;
	}

	public void setSenha(String senha) 
	{
		this.senha = senha;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) 
	{
		this.mensagem = mensagem;
	}
	
	@Override
	public String execute() throws Exception 
	{
		if (LoginAction.mapa.containsKey(this.usuario) && LoginAction.mapa.get(this.senha).equals(this.usuario))
		{
			HttpSession session = ServletActionContext.getRequest().getSession(true);
			session.setAttribute("usuario", this.usuario);
			
			this.mensagem = "Autenticação realizada com sucesso!";
			return LoginAction.SUCCESS;
		}
		else
		{
			this.mensagem = "Usuário e/ou senha incorretos.";
			return LoginAction.INPUT;
		}
	}
}
