package model.entities;

public abstract class Pessoa {
	protected String nome;
	protected String email;
	protected Integer id;

	public Pessoa(String nome, String email, Integer id) {
		this.nome = nome;
		this.email = email;
		this.id = id;
	}

	public Pessoa() {

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
