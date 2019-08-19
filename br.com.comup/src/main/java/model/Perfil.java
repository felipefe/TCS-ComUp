package model;

public enum Perfil {

	GERENTE("Gerente"),
	CAIXA("Caixa"),
	GARCOM("Garçom"),
	COZINHA("Cozinha");	
	
	private String descricao;
	
	Perfil(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
