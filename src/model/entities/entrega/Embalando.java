package model.entities.entrega;

public class Embalando implements StatusPedido {

	@Override
	public String statusPedido(String status) {
		
		return "Pedido no estoque sendo embalado para entrega";
	}

}
