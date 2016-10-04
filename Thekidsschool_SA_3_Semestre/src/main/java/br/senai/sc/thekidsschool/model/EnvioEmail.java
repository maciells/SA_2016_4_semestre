package br.senai.sc.thekidsschool.model;

public class EnvioEmail {
	private String email;
	private String assunto;
	private String mensagem;
	
	public String getEmail() {
		return email;
	}
	public String getAssunto() {
		return assunto;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
