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
		
		System.out.println("==================================");
		Agenda a3 = new Agenda("Fulando da Silva", "Av 666", "16 99995555");
		
		System.out.println("Nome:" + a3.getNome() 
						+ "\nEndereço: " + a3.getEndereco() 
						+ "\nTelefone: " + a3.getTelefone());
		
		System.out.println("==================================");
		Agenda a4 = new Agenda("Beutrano Oliveira", "16 66666-6666");
		
		System.out.println("Nome:" + a4.getNome() 
						+ "\nEndereço: " + a4.getEndereco()
						+ "\nTelefone: " + a4.getTelefone());
		
		System.out.println("==================================");
		Agenda a5 = new Agenda();
		
		a5.setEndereco("Avenida chuchu beleza");
		
		System.out.println("Nome:" + a5.getNome() 
						+ "\nEndereço: " + a5.getEndereco()
						+ "\nTelefone: " + a5.getTelefone());
		
		System.out.println("==================================");
		Agenda a6 = new Agenda();
		//a6.setNome("Roni");
		//a6.setEndereco("Av 1");
		//a6.setTelefone("111111");
		
		Agenda a7 = new Agenda();
		//a7.setNome("Roni");
		//a7.setEndereco("Av1");
		//a7.setTelefone("111111");
		
		if(a6.equals(a7)) {
			System.out.println("Iguais!");
		}else {
			System.out.println("Nao iguais!");
		}
		
		
	}

}
