package br.com.hibernate.model;

import java.util.List;

public interface GenericDao<T> {

	public void inserir(T t);
	public List<T> listar(T t);
	public T pesquisar(T t, Long id);
	public void alterar(T t);
	public void deletar(T t);
	
}
