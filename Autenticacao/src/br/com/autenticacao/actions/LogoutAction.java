package br.com.autenticacao.actions;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LogoutAction extends ActionSupport 
{
	private String mensagem;

	public String getMensagem() 
	{
		return mensagem;
	}

	public void setMensagem(String mensagem) 
	{
		this.mensagem = mensagem;
	}
	
	@Override
	public String execute() throws Exception 
	{
		HttpSession session = ServletActionContext.getRequest().getSession(true);
		session.removeAttribute("usuario");
		
		this.mensagem = "Até logo!";
		
		return LogoutAction.SUCCESS;
	}
}
