package model;

public class Mesa {

	private Long id;
	
	private Long numero;
	
	private boolean situacao;
	
	private String qrCode;
	
	private Ocupacao ocupacao;
	
	public Mesa() {
		// TODO Auto-generated constructor stub
	}

	public Mesa(Long id, Long numero, boolean situacao, String qrCode, Ocupacao ocupacao) {
		super();
		this.id = id;
		this.numero = numero;
		this.situacao = situacao;
		this.qrCode = qrCode;
		this.ocupacao = ocupacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public Ocupacao getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
	}
	
}
