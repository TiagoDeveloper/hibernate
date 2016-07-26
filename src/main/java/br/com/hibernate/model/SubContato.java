package br.com.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "subcontato_sequences", sequenceName="subcontato_sequences", allocationSize=1)
public class SubContato{


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="subcontato_sequences")
	private Long id;
	private String email;
	private int telefone;
	
	public SubContato(Long id, String email, int telefone) {
		super();
		this.id = id;
		this.email = email;
		this.telefone = telefone;
	}
	
	public SubContato() {
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "SubContato [id=" + id + ", email=" + email + ", telefone=" + telefone + "]";
	}

}
