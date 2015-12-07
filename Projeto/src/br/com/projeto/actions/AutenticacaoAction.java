package br.com.projeto.actions;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import br.com.projeto.model.Usuario;
import br.com.projeto.model.UsuarioRepository;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class AutenticacaoAction extends ActionSupport 
{
	private Usuario usuario = new Usuario();
	
	private String mensagem;
	
	public String getMensagem()
	{
		return mensagem;
	}

	public void setMensagem(String mensagem) 
	{
		this.mensagem = mensagem;
	}

	private EntityManager getEntityManager()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		EntityManager manager = (EntityManager) request.getAttribute("EntityManager");
		
		return manager;
	}
	
	public String login()
	{
		EntityManager manager = this.getEntityManager();
		UsuarioRepository repository = new UsuarioRepository(manager);
		
		if (repository.existeUsernameEPassword(this.usuario.getUserName(), this.usuario.getPassword()))
		{
			HttpSession session = ServletActionContext.getRequest().getSession();
			session.setAttribute("usuario", this.usuario);
			
			return AutenticacaoAction.SUCCESS;
		}
		else
		{
			this.mensagem = "Usuário e/ou senha incorretos.";
			
			return AutenticacaoAction.INPUT;
		}
		
	}
	
	public String logout()
	{
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.removeAttribute("usuario");
		
		this.mensagem = "Até logo!";
		
		return AutenticacaoAction.SUCCESS;
	}
}
