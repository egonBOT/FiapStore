package br.com.fiap.model;

import br.com.fiap.util.CriptografiaUtils;

public class Usuario {

	private String email;
	private String senha;
	private int id;

	public Usuario(String email, String senha) {
		super();
		this.email = email;
		setSenha(senha);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		try {
			this.senha = CriptografiaUtils.criptografar(senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
