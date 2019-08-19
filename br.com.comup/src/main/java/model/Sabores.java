package model;

public class Sabores {

	private Long id;
	
	private String nome;
	
	private String descricao;
	
	private Categoria categoria;

	public Sabores() {
		// TODO Auto-generated constructor stub
	}
	
	public Sabores(Long id, String nome, String descricao, Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}	
	
}
