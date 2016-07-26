package br.com.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name = "contato_sequences", sequenceName="contato_sequences", allocationSize=1)
public class Contato implements InterfaceContato{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="contato_sequences")
	private Long id;
	private String nome;
	private String email;
	private int telefone;

	@OneToOne
	private SubContato subContato;
	
	
	public Contato(Long id, String nome, String email, int telefone, SubContato subContato) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.subContato = subContato;
	}


	public Contato() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public SubContato getSubContato() {
		return subContato;
	}


	public void setSubContato(SubContato subContato) {
		this.subContato = subContato;
	}


	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", subContato="
				+ subContato + "]";
	}
	

}
