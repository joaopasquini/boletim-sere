package sere.com.br.boletim.controller.form;

import sere.com.br.boletim.modelo.Responsavel;

public class ResponsavelForm {
	
	private Long   cpf;
	private String nome;
	private String email;
	private String senha;
	
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		this.senha = senha;
	}
	
	public Responsavel converter() {
		return new Responsavel(cpf,nome,email,senha);
	}


}
