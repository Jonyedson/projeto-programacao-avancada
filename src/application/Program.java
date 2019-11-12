package application;

import model.entities.Cliente;
import model.entities.Produto;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		Produto p = new Produto(29.00, "Fone", "JBL");
		Produto p2 = new Produto(39.00, "Fone", "JBL com Blue");
		Produto p3 = new Produto(49.00, "Fone", "JBL dourado");
		Cliente c = new Cliente("João", "joão@gmail.com", 1);
		Vendedor v = new Vendedor("Lucas", "lucasvendas@gmail.com", 2);
		
		v.addProduto(p);
		v.addProduto(p2);
		v.addProduto(p3);
		v.mostraProdutos();
	}

}
