package model.entregas;

public class Entegue implements StatusPedido {

	@Override
	public String statusPedido(String status) {

		return "Pedido entregue com sucesso!";
	}

}
