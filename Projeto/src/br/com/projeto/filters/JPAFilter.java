package br.com.projeto.filters;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class JPAFilter implements Filter
{
	
	private EntityManagerFactory factory;

	@Override
	public void init(FilterConfig arg0) throws ServletException 
	{
		this.factory = Persistence.createEntityManagerFactory("projeto-pu");
	}

	@Override
	public void destroy()
	{
		this.factory.close();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException 
	{
		// Chegada
		EntityManager entityManager = this.factory.createEntityManager();
		request.setAttribute("EntityManager", entityManager);
		entityManager.getTransaction().begin();
		
		// Filtro do Struts
		chain.doFilter(request, response);
		
		// Saída
		try 
		{
			entityManager.getTransaction().commit();
		} catch (Exception e) 
		{
			entityManager.getTransaction().rollback();
		}
		finally
		{
			entityManager.close();
		}
	}

}
