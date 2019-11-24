package model.entregas;

public class Enviado implements StatusPedido {

	@Override
	public String statusPedido(String status) {
		return "Pedido sendo enviado para o cliente de destino";
	}

}
