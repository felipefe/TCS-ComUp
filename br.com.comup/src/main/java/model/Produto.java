package model;

import java.util.List;

public class Produto {

	private Long id;
	
	private String nome;
	
	private String descricao;
	
	private Double valor;
	
	private Categoria categoria;
	
	private boolean divisivel;
	
	private List<Sabores> sabores;
	
	private Integer quantidadeSabor;
	
	// status 
	private boolean ativo;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Long id, String nome, String descricao, Double valor, Categoria categoria, boolean divisivel,
			List<Sabores> sabores, Integer quantidadeSabor, boolean ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
		this.divisivel = divisivel;
		this.sabores = sabores;
		this.quantidadeSabor = quantidadeSabor;
		this.ativo = ativo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public boolean isDivisivel() {
		return divisivel;
	}

	public void setDivisivel(boolean divisivel) {
		this.divisivel = divisivel;
	}

	public List<Sabores> getSabores() {
		return sabores;
	}

	public void setSabores(List<Sabores> sabores) {
		this.sabores = sabores;
	}

	public Integer getQuantidadeSabor() {
		return quantidadeSabor;
	}

	public void setQuantidadeSabor(Integer quantidadeSabor) {
		this.quantidadeSabor = quantidadeSabor;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
