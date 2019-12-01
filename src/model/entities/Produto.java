package model.entities;

public class Produto {

	private Integer codigo;
	private Double valor;
	private String nome;
	private String descriçao;
	private Integer quantidade;
	private static Integer quantidadeTotal;

	public Produto() {
		
	}

	public Produto(String name, Double valor, String descriçao, Integer codigo, Integer quantidade) {
		this.valor = valor;
		this.nome = name;
		this.descriçao = descriçao;
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	
	public Produto(String name, Double valor, String descriçao, Integer codigo) {
		this.valor = valor;
		this.nome = name;
		this.descriçao = descriçao;
		this.codigo = codigo;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}

	@Override
	public String toString() {
		return "name=" + nome + ", valor=" + valor + ", descriçao=" + descriçao + "Codigo=" + codigo;
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
