package com.policamp.androidapp.models;

public class ItemPedido {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public StatusPedido getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}
	
	private int id;
	private Produto produto;
	private StatusPedido statusPedido;
	
	public enum StatusPedido{
		ABERTO,
		CANCELADO,
		FECHADO,
		FATURADO
	}
}
