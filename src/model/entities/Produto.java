package model.entities;

public class Produto {

	private Double valor;
	private String name;
	private String descriçao;

	public Produto() {

	}

	public Produto(Double valor, String name, String descriçao) {
		this.valor = valor;
		this.name = name;
		this.descriçao = descriçao;
	}

	@Override
	public String toString() {
		return "Produto [valor=" + valor + ", name=" + name + ", descriçao=" + descriçao + "]";
	}

	
}
