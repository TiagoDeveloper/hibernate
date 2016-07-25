package br.com.hibernate.dao.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.hibernate.dao.ContatoDao;
import br.com.hibernate.model.Contato;

public class ContatoDaoTest {
	
	private ContatoDao dao;
	
	@Test
	public void testContatoDao() {
		
	}

	@Test
	public void testInserir() {
		//this.dao = new ContatoDao();
		//this.dao.inserir(new Contato("tania","taniamariapereira@gmail.com",81397206));
		
	}

	@Test
	public void testListar() {
		
		/**this.dao = new ContatoDao();
		for(Contato c : this.dao.listar()){
			
			System.out.println(c.toString());
		}**/
	}

	@Test
	public void testPesquisar() {
		this.dao = new ContatoDao();
		Contato t = new Contato();
		t.setId(2L);
		System.out.println(this.dao.pesquisar(t).toString());
		
	}

	@Test
	public void testAlterar() {
		
	}

	@Test
	public void testDeletar() {
		
	}

}
