package model.entities;

public class Cliente extends Pessoa {

	
	
	public Cliente(){
		
	}
	
	public Cliente(String nome, String email, Integer id) {
		super(nome, email, id);

	}

	@Override
	public String toString() {
		return "nome : " + nome + ", Email : " + email + ", Id : " + id;
	}

}
