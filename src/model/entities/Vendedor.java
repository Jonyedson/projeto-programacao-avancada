package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Pessoa {

	private List<Produto> produtos = new ArrayList<>();
	private List<Venda> vendas = new ArrayList<>();

	public Vendedor(String nome, String email, int id) {
		super(nome, email, id);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void mostraProdutos() {

		for (Produto p : produtos) {
			System.out.println(p);
		}
	}

	public void addProduto(Produto produto) {
		produtos.add(produto);

	}

	public void removerProdutos(Produto produto) {
		produtos.remove(produto);
	}
	
}
