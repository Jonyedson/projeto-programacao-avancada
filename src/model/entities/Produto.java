package model.entities;

public class Produto {

	private Integer codigo;
	private Double valor;
	private String name;
	private String descri�ao;
	private Integer quantidade;
	private static Integer quantidadeTotal;

	public Produto() {
		
	}

	public Produto(String name, Double valor, String descri�ao, Integer codigo, Integer quantidade) {
		this.valor = valor;
		this.name = name;
		this.descri�ao = descri�ao;
		this.codigo = codigo;
		this.quantidade = quantidade;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescri�ao() {
		return descri�ao;
	}

	public void setDescri�ao(String descri�ao) {
		this.descri�ao = descri�ao;
	}

	@Override
	public String toString() {
		return "name=" + name + ", valor=" + valor + ", descri�ao=" + descri�ao + "Codigo=" + codigo;
	}

	public static Integer getQuantidadeTotal() {
		return quantidadeTotal;
	}

	public static void setQuantidadeTotal(Integer quantidadeTotal) {
		Produto.quantidadeTotal = +quantidadeTotal;
	}

	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
