package br.com.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.hibernate.model.SubContato;
import br.com.hibernate.model.GenericDao;

public class SubContatoDao implements GenericDao<SubContato>{
	
	private EntityManagerFactory factory;
	private EntityManager manager;
	
	public SubContatoDao() {
		
		this.factory = Persistence.createEntityManagerFactory("hibernate");
		this.manager = this.factory.createEntityManager();
		
	}
	
	
	
	@Override
	public void inserir(SubContato t) {
		
		this.manager.getTransaction().begin();
		this.manager.persist(t);
		this.manager.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SubContato> listar(String entity) {
		return this.manager.createQuery("select c from "+entity+" c").getResultList();
	}

	@Override
	public SubContato pesquisar(Long t) {
		return this.manager.find(SubContato.class, t);
	}

	@Override
	public void alterar(SubContato t) {
		
		this.manager.getTransaction().begin();
		this.manager.merge(t);
		this.manager.getTransaction().commit();
		
	}

	@Override
	public void deletar(SubContato t) {
		// TODO Auto-generated method stub
		
	} 

}
