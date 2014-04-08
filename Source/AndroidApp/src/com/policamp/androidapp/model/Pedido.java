package com.policamp.androidapp.models;

import java.util.Date;
import java.util.List;

public class Pedido {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public List<ItemPedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<ItemPedido> pedidos) {
		this.pedidos = pedidos;
	}
	private int id;
	private Date dataPedido;
	private List<ItemPedido> pedidos;
}
