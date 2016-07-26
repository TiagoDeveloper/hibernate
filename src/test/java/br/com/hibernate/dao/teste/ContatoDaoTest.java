package br.com.hibernate.dao.teste;

import org.junit.Test;

import br.com.hibernate.dao.ContatoDao;
import br.com.hibernate.dao.SubContatoDao;
import br.com.hibernate.model.Contato;
import br.com.hibernate.model.InterfaceContato;
import br.com.hibernate.model.SubContato;

public class ContatoDaoTest {
	
	
	private SubContatoDao sdao;
	

	public void testContatoDao() {
		//this.dao = new ContatoDao();
	}

	@Test
	public void testInserir() {
		ContatoDao<Contato> dao = new ContatoDao<Contato>();
		//this.sdao = new SubContatoDao();
		//this.dao.inserir(new Contato(null,"tania","taniamariapereira@gmail.com",81397206));
		SubContato sc = new SubContato();
		sc.setId(1L);
		sc.setEmail("tiagopfsk8@hotmail.com");
		sc.setTelefone(34583883);
		
		Contato c = new Contato();
		c.setNome("tiago");
		c.setEmail("tiagopereirafonseca@gmail.com");
		c.setTelefone(983606298);
		c.setSubContato(sc);
		
		dao.inserir(c);
		
	}

	
	public void testListar() {
		
		ContatoDao<SubContato> dao = new ContatoDao();
		
		for(InterfaceContato c : dao.listar("Contato")){
			
			System.out.println(c.toString());
		}
	}

	
	public void testPesquisar() {
		ContatoDao<SubContato> dao = new ContatoDao();
		Contato t = new Contato();
		t.setId(2L);
		System.out.println(dao.pesquisar(t.getId()).toString());
		
	}

	
	public void testAlterar() {
		
		ContatoDao<SubContato> dao = new ContatoDao();
		
/*		Contato t = new Contato(null,"Aender","aenderjl@hotmail.com",92806796);
		t.setId(2L);
		
		this.dao.alterar(t);*/
		
		
		
	}


	public void testDeletar() {
		
	}

}
