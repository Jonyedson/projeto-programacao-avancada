package model.entities;

public class Produto {

	private Double valor;
	private String name;
	private String descri�ao;

	public Produto() {

	}

	public Produto( String name, Double valor, String descri�ao) {
		this.valor = valor;
		this.name = name;
		this.descri�ao = descri�ao;
	}

	@Override
	public String toString() {
		return "Produto [valor=" + valor + ", name=" + name + ", descri�ao=" + descri�ao + "]";
	}

	
}
