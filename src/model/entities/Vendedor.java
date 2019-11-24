package model.entities;

public class Vendedor extends Pessoa {

	public Vendedor(String nome, String email, int id) {
		super(nome, email, id);
	}

	@Override
	public String toString() {
		return "nome : " + nome + ", email : " + email + ", id : " + id;
	}
}
