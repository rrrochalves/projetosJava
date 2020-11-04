package br.com.codando.test;

import br.com.codando.objetos.Agenda;

public class AgendaTest {

	public static void main(String[] args) {
		Agenda a = new Agenda();
		
		a.setNome("Fabi de Oliveira e Silva");
		a.setEndereco("Avenida Da Bruxa, 666");
		a.setTelefone("16 - 99999-9999");
		
		
		System.out.println("==================================");
		System.out.println("Nome:     " + a.getNome()  
				+ "\nEndereço: " + a.getEndereco()
				+ "\nTelefone: " + a.getTelefone());
		System.out.println("==================================");
		
		Agenda a2 = new Agenda();
		a2.setNome("Roni Rafael");
		a2.setEndereco("Av Nestor Fenandes");
		a2.setTelefone("16 - 99999-9999");
		
		
		System.out.println("==================================");
		System.out.println("Nome:     " + a2.getNome()  
				+ "\nEndereço: " + a2.getEndereco()
				+ "\nTelefone: " + a2.getTelefone());
		System.out.println("==================================");
	}

}
