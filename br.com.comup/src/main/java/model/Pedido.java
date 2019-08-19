package model;

import java.util.List;

public class Pedido {

	private Long id;
	
	private String nomeCliente;
	
	private Mesa mesa;
	
	private StatusPreparo statusPreparo;
	
	private List<ItemPedido> itemPedido;
	

	public Pedido() {
	}

	public Pedido(Long id, String nomeCliente, Mesa mesa, StatusPreparo statusPreparo, List<ItemPedido> itemPedido) {
		super();
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.mesa = mesa;
		this.statusPreparo = statusPreparo;
		this.itemPedido = itemPedido;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public Mesa getMesa() {
		return mesa;
	}


	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}


	public StatusPreparo getStatusPreparo() {
		return statusPreparo;
	}


	public void setStatusPreparo(StatusPreparo statusPreparo) {
		this.statusPreparo = statusPreparo;
	}


	public List<ItemPedido> getItemPedido() {
		return itemPedido;
	}


	public void setItemPedido(List<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}	
}
