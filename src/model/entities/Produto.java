package model.entities;

public class Produto {
	
	private Integer codigo;
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
		return "name=" + name + ", valor=" + valor + ", descri�ao=" + descri�ao;
	}

	
}
