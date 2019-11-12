package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente  extends Pessoa{

	
	
	public Cliente(String nome, String email, int id) {
		super(nome, email, id);
	
	}

	private List<Compra> compras = new ArrayList<>();
	
	
	
}
