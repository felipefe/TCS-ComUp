package model;

public class ItemPedido {

	private Long id;
	
	private Double valorUnitario;
	
	private Integer quantidade;
	
	private Produto produto;
	
	public ItemPedido() {
	}

	public ItemPedido(Long id, Double valorUnitario, Integer quantidade, Produto produto) {
		super();
		this.id = id;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
