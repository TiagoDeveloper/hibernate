package br.com.hibernate.dao.teste;

import java.util.List;

import org.junit.Test;

import br.com.hibernate.dao.ContatoDao;
import br.com.hibernate.model.Contato;
import br.com.hibernate.model.SubContato;

public class ContatoDaoTest {
	
	
	
	

	public void testContatoDao() {
		
		@SuppressWarnings("unused")
		ContatoDao<Contato> dao = new ContatoDao<Contato>();
		
	}

	public void testSubContato() {
		
		@SuppressWarnings("unused")
		ContatoDao<SubContato> sdao = new ContatoDao<SubContato>();
		
	}


	public void testInserirSubContato() {
		ContatoDao<SubContato> dao = new ContatoDao<SubContato>();
		
		SubContato sc = new SubContato();
		sc.setId(1L);
		sc.setEmail("tiagopfsk8@hotmail.com");
		sc.setTelefone(34583883);

		
		dao.inserir(sc);
		
	}
	
	
	public void testInserirContato() {
		
		ContatoDao<Contato> dao = new ContatoDao<Contato>();
		ContatoDao<SubContato> sdao = new ContatoDao<SubContato>();

		
		Contato c = new Contato();
		c.setNome("Zoraides");
		c.setEmail("Zoraidesfonseca@gmail.com");
		c.setTelefone(983606298);
		c.setSubContato(sdao.pesquisar(new SubContato(),1L));
		
		dao.inserir(c);
		
	}

	
	public void testListarSubContato() {
		
		ContatoDao<SubContato> dao = new ContatoDao<SubContato>();
		
		for(SubContato c : dao.listar(new SubContato())){
			
			System.out.println(c.toString());
		}
	}
	
	public void testListarContato() {
		
		ContatoDao<Contato> dao = new ContatoDao<Contato>();
		
		for(Contato c : dao.listar(new Contato())){
			
			System.out.println(c.toString());
		}
	}

	
	public void testPesquisarSubContato() {
		ContatoDao<SubContato> dao = new ContatoDao<SubContato>();
		SubContato t = new SubContato();
		t.setId(2L);
		System.out.println(dao.pesquisar(t,2L).toString());
		
	}
	
	public void testPesquisarContato() {
		ContatoDao<Contato> dao = new ContatoDao<Contato>();
		Contato t = new Contato();
		t.setId(2L);
		System.out.println(dao.pesquisar(t,2l).toString());
		
	}

	
	public void testAlterarSubContato() {
		
		ContatoDao<SubContato> dao = new ContatoDao<SubContato>();
		
		SubContato t = new SubContato(1L,"aenderjl@hotmail.com",92806796);
		
		
		dao.alterar(t);
		
		
		
	}
	
	public void testAlterarContato() {
		
		ContatoDao<Contato> dao = new ContatoDao<Contato>();


		SubContato s = new SubContato();
		s.setId(1L);
		
		Contato t = new Contato(2L,"Aender","aenderjl@hotmail.com",92806796,s);
		
		
		dao.alterar(t);
		
		
		
	}
	
	public void testPesquisaNome(){
		ContatoDao<Contato> dao = new ContatoDao<Contato>();
		List<Contato> con = dao.pesquisaNome("tia");
		
		
		for(Contato c : con){
			System.out.println(c.toString());
		}
	}
	
	
	public void testDeletar() {
		ContatoDao<Contato> dao = new ContatoDao<Contato>();

		dao.deletar(dao.pesquisar(new Contato(), 4L));
		
	}
	
	@Test
	public void testes(){
		
		this.testListarContato();
		
	}

}
