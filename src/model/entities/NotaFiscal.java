package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscal {

	private List<Produto> products = new ArrayList<>();
	private Date date ;
	
	
	public void addProduto(Produto produto) {
		products.add(produto);
	}
	
	
}
