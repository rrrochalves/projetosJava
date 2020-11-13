package br.com.codando.exercicios;

public class Conta {
	private String descricao;
	private String tipo;
	private Double valor;
	private String data;

	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Conta(String descricao, String tipo, Double valor, String data) {
		this.descricao = descricao;
		this.tipo = tipo;
		this.valor = valor;
		this.data = data;
	}
	
	public Conta() {
		
	}
	
}
