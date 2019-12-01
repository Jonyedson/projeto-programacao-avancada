package model.entities.entrega;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.entities.Produto;

public class ListIterator implements Iterator{

	private List<Produto> produtos = new ArrayList();
	private Integer posicao = 0;
	
	public ListIterator(List<Produto> produtos ) {
		this.produtos = produtos;
	}
	@Override
	public boolean hasNext() {
		if(posicao >= produtos.size() || produtos.isEmpty()) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		Produto produto = produtos.get(posicao);
		posicao++;
		return produto;
	}

}
