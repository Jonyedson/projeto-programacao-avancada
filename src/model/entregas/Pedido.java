package model.entregas;

import java.util.ArrayList;
import java.util.List;

import model.entities.Produto;

public class Pedido {

	private Integer codigo;
	private List<Produto> produtos = new ArrayList<>();

	private StatusPedido statusPedido;

	public Pedido(Integer codigo) {
		this.codigo = codigo;
		this.statusPedido = new Embalando();
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statuspedido) {
		this.statusPedido = statuspedido;
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	
}
