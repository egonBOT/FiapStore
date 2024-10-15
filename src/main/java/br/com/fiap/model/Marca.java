package br.com.fiap.model;

public class Marca {

	private String nome;
	private String paisOrigem;
	private String descriçao;
	private int codigo;

	public Marca(String nome, String paisOrigem, String descriçao, int codigo) {

		this.nome = nome;
		this.paisOrigem = paisOrigem;
		this.descriçao = descriçao;
		this.codigo = codigo;
	}

	public Marca() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
