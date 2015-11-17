package br.com.integracaostrutscomjpa.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import br.com.integracaostrutscomjpa.model.Carro;
import br.com.integracaostrutscomjpa.model.CarroRepository;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class AdicionaCarroAction extends ActionSupport
{
	private Carro carro = new Carro();

	public Carro getCarro() 
	{
		return carro;
	}

	public void setCarro(Carro carro) 
	{
		this.carro = carro;
	}

	private EntityManager getEntityManager()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		EntityManager manager = (EntityManager) request.getAttribute("EntityManager");
		
		return manager;
	}

	public List<Carro> getCarros()
	{
		EntityManager manager = getEntityManager();
		CarroRepository repository = new CarroRepository(manager);
		return repository.buscaTodos();
	}
	
	@Override
	public String execute() throws Exception 
	{
		EntityManager manager = getEntityManager();
		CarroRepository repository = new CarroRepository(manager);
		
		repository.adiciona(this.carro);
		this.carro = new Carro();
		
		return AdicionaCarroAction.SUCCESS;
	}
	
}
