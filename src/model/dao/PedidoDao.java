package model.dao;

import java.util.List;

import model.entities.entrega.Pedido;

import model.entities.entrega.Pedido;

public interface PedidoDao {
	void insert(Pedido obj);
	void update(Pedido obj);
	void delete(Integer id);
	Pedido findById(Integer id);
	List<Pedido> findAll();
}
