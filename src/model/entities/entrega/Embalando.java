package model.entities.entrega;

public class Embalando implements StatusPedido {
	private String a = "Pedido no estoque sendo embalado para entrega";
	@Override
	public String statusPedido(String status) {
		
		return a ;
	}
	@Override
	public String toString() {
		return a;
	}
}
