package model.entities.entrega;

public class Enviado implements StatusPedido {
	private String a = "Pedido sendo enviado para o cliente de destino";
	@Override
	public String statusPedido(String status) {
		
		return a ;
	}

	@Override
	public String toString() {
		return a ;
	}
}
