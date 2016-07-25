package br.com.hibernate.dao.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.hibernate.dao.ContatoDao;
import br.com.hibernate.model.Contato;

public class ContatoDaoTest {
	
	private ContatoDao dao;
	

	public void testContatoDao() {
		this.dao = new ContatoDao();
	}

	
	public void testInserir() {
		this.dao = new ContatoDao();
		this.dao.inserir(new Contato("tania","taniamariapereira@gmail.com",81397206));
		
	}

	
	public void testListar() {
		
		this.dao = new ContatoDao();
		for(Contato c : this.dao.listar()){
			
			System.out.println(c.toString());
		}
	}

	
	public void testPesquisar() {
		this.dao = new ContatoDao();
		Contato t = new Contato();
		t.setId(2L);
		System.out.println(this.dao.pesquisar(t).toString());
		
	}

	
	public void testAlterar() {
		
		this.dao = new ContatoDao();
		
		Contato t = new Contato("Aender","aenderjl@hotmail.com",92806796);
		t.setId(2L);
		
		this.dao.alterar(t);
		
		
		
	}

	@Test
	public void testDeletar() {
		
	}

}
