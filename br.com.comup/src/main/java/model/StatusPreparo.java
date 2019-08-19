package model;

public enum StatusPreparo {

	FILADEPREPARO("Na fila de prepara��o"),
	EMPREPARACAO("Em prepara��o"),
	FINALIZADO("Finalizado");

	private String descricao;

	StatusPreparo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
