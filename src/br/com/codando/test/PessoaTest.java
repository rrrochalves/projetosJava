package br.com.codando.test;

import br.com.codando.objetos.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		//Instancias para o Objeto
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		//Setando valores
		pessoa1.nome = "Roni Rafael da Rocha Alves";
		pessoa1.idade = 26;
		pessoa1.nascimento = "17/08/1994";
		
		pessoa2.nome = "Fabiana Nahid";
		pessoa2.idade = 26;
		pessoa2.nascimento = "17/08/1994";
		
		pessoa3.nome = "Taina Sabino";
		pessoa3.idade = 14;
		pessoa3.nascimento = "17/08/2004";
		
		//Impressão de valores;
		System.out.println("==============================");
		
		System.out.println("Nome: " + pessoa1.nome 
									+ "\nIdade: " + pessoa1.idade 
									+ "\nNascimento: " + pessoa1.nascimento);
		
		System.out.println("==============================");
		
		System.out.println("Nome: " + pessoa2.nome 
									+ "\nIdade: " + pessoa2.idade 
									+ "\nNascimento: " + pessoa2.nascimento);
		
		System.out.println("==============================");
		
		System.out.println("Nome: " + pessoa3.nome 
									+ "\nIdade: " + pessoa3.idade 
									+ "\nNascimento: " + pessoa3.nascimento);
		pessoa3.andar();
		
		System.out.println("==============================");

	}

}
