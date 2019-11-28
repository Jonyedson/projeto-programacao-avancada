package model.entities;

public class Produto {

	private Integer codigo;
	private Double valor;
	private String name;
	private String descriçao;
	private Integer quantidade;
	private static Integer quantidadeTotal;

	public Produto() {
		
	}

	public Produto(String name, Double valor, String descriçao, Integer codigo, Integer quantidade) {
		this.valor = valor;
		this.name = name;
		this.descriçao = descriçao;
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

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}

	@Override
	public String toString() {
		return "name=" + name + ", valor=" + valor + ", descriçao=" + descriçao + "Codigo=" + codigo;
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
