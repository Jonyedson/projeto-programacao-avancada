package model.entities;

public class Cliente extends Pessoa {

	public Cliente(String nome, String email, int id) {
		super(nome, email, id);

	}

	@Override
	public String toString() {
		return "Nome: " + nome + " Email: " + email + " Id: " + id;
	}

}
