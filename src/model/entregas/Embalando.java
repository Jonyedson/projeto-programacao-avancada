package model.entregas;

public class Embalando implements StatusPedido {

	@Override
	public String statusPedido(String status) {
		
		return "Pedido no estoque sendo embalado para entrega";
	}

}
