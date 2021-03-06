package br.com.codando.objetos;

public class Agenda {
	private String nome;
	private String endereco;
	private String telefone;
	
	public String getNome() {
		return this.nome;
	}
	//Paramentro nome seja inserido no atributo nome;
	//A gente usa(referencia um atributo de classe usando a palavra reservada (this)
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//COntrutor padrao;
	public Agenda() {
		
	}
	
	public Agenda(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	//Construtor Completo;
	public Agenda(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	
	@Override
	public boolean equals(Object agenda) {
		if(this.nome == ((Agenda) agenda).getNome() 
				&& this.endereco == ((Agenda) agenda).getEndereco() 
				&& this.telefone == ((Agenda) agenda).getTelefone()) {
			
			return true;
		}
		return false;
	}
	
}
