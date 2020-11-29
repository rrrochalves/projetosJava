package br.com.codando.prova2;

public class Lancamento{
	
	private int id;
	private String descricao;
	private Double valor;
	
	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	//CONSTRUTORES
	public Lancamento(int id, String descricao, Double valor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Lancamento(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	
	public Lancamento(int id, Double valor) {
		super();
		this.id = id;
		this.valor = valor;
	}
	
	public Lancamento(String descricao, Double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	public Lancamento() {
		
	}
	
	//HASH CODE
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + id;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}
		
	//EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lancamento other = (Lancamento) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id != other.id)
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", descricao=" + descricao + ", valor=" + valor + "]";
	}

}
