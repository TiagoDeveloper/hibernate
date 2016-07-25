package br.com.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.hibernate.model.Contato;
import br.com.hibernate.model.GenericDao;

public class ContatoDao implements GenericDao<Contato>{
	
	private EntityManagerFactory factory;
	private EntityManager manager;
	
	public ContatoDao() {
		
		this.factory = Persistence.createEntityManagerFactory("hibernate");
		this.manager = this.factory.createEntityManager();
		
	}
	
	
	
	@Override
	public void inserir(Contato t) {
		
		this.manager.getTransaction().begin();
		this.manager.persist(t);
		this.manager.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contato> listar() {
		return this.manager.createQuery("select c from Contato c").getResultList();
	}

	@Override
	public Contato pesquisar(Contato t) {
		return this.manager.find(Contato.class, t.getId());
	}

	@Override
	public void alterar(Contato t) {
		
		this.manager.getTransaction().begin();
		this.manager.merge(t);
		this.manager.getTransaction().commit();
		
	}

	@Override
	public void deletar(Contato t) {
		// TODO Auto-generated method stub
		
	}

}
