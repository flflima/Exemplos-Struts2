package br.com.aleatorios.actions;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class NumeroAleatorioAction extends ActionSupport
{
	private int maximo;
	private int numeroAleatorio;
	
	@Override
	public String execute() throws Exception 
	{
		this.numeroAleatorio = (int) (Math.random() * this.maximo);
		return NumeroAleatorioAction.SUCCESS;
	}

	public int getMaximo() 
	{
		return maximo;
	}

	public void setMaximo(int maximo) 
	{
		this.maximo = maximo;
	}

	public int getNumeroAleatorio() 
	{
		return numeroAleatorio;
	}

	public void setNumeroAleatorio(int numeroAleatorio) 
	{
		this.numeroAleatorio = numeroAleatorio;
	}
}
