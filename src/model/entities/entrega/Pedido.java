package model.entities.entrega;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.entities.Cliente;
import model.entities.Produto;
import model.entities.Vendedor;

public class Pedido {

	private Integer codigo;
	private Cliente cliente;
	private Vendedor vendedor;
	private List<Produto> produtos = new ArrayList<>();
	private StatusPedido statusPedido;

	public Pedido(Integer codigo, Cliente cliente, Vendedor vendedor) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.statusPedido = new Embalando();
	}

	public Pedido(Integer codigo) {
		this.codigo = codigo;
		this.statusPedido = new Embalando();
	}

	public Pedido() {
		this.statusPedido = new Embalando();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public StatusPedido getStatusPedido() {
		return this.statusPedido;
	}

	public Iterator getIterartor() {
		return new ListIterator(produtos);

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
