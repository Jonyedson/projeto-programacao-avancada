package model.entities.entrega;

public class Entegue implements StatusPedido {
	private String a = "Pedido entregue com sucesso!";

	@Override
	public String statusPedido(String status) {

		return a;
	}

	@Override
	public String toString() {
		return a;
	}
}
