package br.com.paginasdeerro.actions;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ErroAction extends ActionSupport
{
	@Override
	public String execute() throws Exception 
	{
		System.out.println(10/0);
		return ErroAction.SUCCESS;
	}
}
