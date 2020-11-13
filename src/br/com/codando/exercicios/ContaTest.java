package br.com.codando.exercicios;

public class ContaTest {

	public static void main(String[] args) {
		Conta c = new Conta();
		
		c.setDescricao("Conta de Luz");
		c.setTipo("1");
		c.setValor(225.5);
		c.setData("10/01/2020");
		
		System.out.println("Descrição: " + c.getDescricao());
		System.out.println("Tipo: " + c.getTipo());
		System.out.println("Valor: " + c.getValor());
		System.out.println("Data: " + c.getData());
	}

}
