package br.com.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.hibernate.model.GenericDao;

public class ContatoDao<T> implements GenericDao<T>{
	
	private EntityManagerFactory factory;
	private EntityManager manager;
	
	public ContatoDao() {
		
		this.factory = Persistence.createEntityManagerFactory("hibernate");
		this.manager = this.factory.createEntityManager();
		
	}
	
	
	
	@Override
	public void inserir(T t) {
		
		this.manager.getTransaction().begin();
		this.manager.persist(t);
		this.manager.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listar(T t) {
		
		Query query = this.manager.createQuery("select c from "+t.getClass().getSimpleName().toString()+" c");
				
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pesquisar(T t, Long id) {
		
		//System.out.println(t.getClass());
		//Criteria c= 
		//(T) this.manager.find(Contato.class,t)
		//(T) this.manager.createQuery("select c from SubContato c where id=2").getSingleResult();
		return (T) this.manager.find(t.getClass(),id); 
		
	}

	@Override
	public void alterar(T t) {
		
		this.manager.getTransaction().begin();
		this.manager.merge(t);
		this.manager.getTransaction().commit();
		
	}

	@Override
	public void deletar(T t) {
		
		this.manager.getTransaction().begin();
		this.manager.remove(t);
		this.manager.getTransaction().commit();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<T> pesquisaNome(String nome){
		
		Query query = this.manager.createQuery("select c from Contato c where c.nome like :nome");
		query.setParameter("nome", "%"+nome+"%");

		return query.getResultList();
	}
}
