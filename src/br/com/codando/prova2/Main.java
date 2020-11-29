package br.com.codando.prova2;

import javax.swing.JOptionPane;

/*
 *  Implemente uma classe que apresente em um Menu (JOptionPane) 
 *	as opções do 
 *		*CRUD (acrônimo de Create, 
 *		*Read[ Mostrar por indice e Mostrar todos], 
 *		*Update [utilizar Indice], 
 *		*Delete [utilizar indice] )  e 
 *	faça a implementação utilizando vetor dos objetos Lançamentos.   
 *	PS: O vetor pode ser substituído por alguma coleção se desejado.
 * */
public class Main {
	
	public static IControlarLancamento ICLancamento = new ControlarLancamento();
	
	public static ControlarLancamento controlarLancamento = new ControlarLancamento();
		
	private static final String menu = "------------- Controle de Lançamentos ---------------\n"
									  +"1.Inserir Lancamento							     \n"
									  +"2.Ler Lancamento								     \n"
									  +"3.Atualizar Lancamento						     	 \n"
									  +"4.Excluir Lancamento							     \n"
									  +"5.Sair										         \n";
	
	private static String opcao = "";
	
	public static void main(String[] args) {
		
		while(!opcao.equals("5")) {
			opcao = JOptionPane.showInputDialog(menu);
			switch(opcao) {
				case "1":
					ICLancamento.inserirLancamento(getLancamentoFromUsuario());
					break;
				case "2":
					 opcao = JOptionPane.showInputDialog("Deseja pesquisar: \n 1 - TODOS \n 2 - POR ID");
					 switch(opcao) {
					 	 case "1":
					 		 JOptionPane.showMessageDialog(null,ICLancamento.listarLancamentos());
					 		 break;
					 	 case "2":
					 		 int idPesquisa = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id desejado"));
					 		 JOptionPane.showMessageDialog(null, ICLancamento.listarLancamentoId(idPesquisa));
					 		 break;
					 	 default:
					 		 JOptionPane.showMessageDialog(null, "Digite uma opção valida");
					 }
					
					break;
				case "3":
						int idAtualizacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id desejado"));
						
						if(ICLancamento.getLancamento(idAtualizacao)) {
							String descricao = JOptionPane.showInputDialog("Digite a nova Descrição");
							Double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor"));
							JOptionPane.showMessageDialog(null, ICLancamento.atualizarLancamento(idAtualizacao, descricao, valor));
						}else {
							JOptionPane.showMessageDialog(null, "Não foi localizado o Item de Id - " + idAtualizacao + " - Por gentileza Verificar!");
						}
						
					break;
				case "4":
						int idExcluido = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id a ser removido"));
						JOptionPane.showMessageDialog(null, ICLancamento.excluirLancamento(idExcluido));
					break;
				case "5":
					break;
				default:
					JOptionPane.showMessageDialog(null, "Digite uma opção valida!");
			}
		}
	}
	
	public static Lancamento getLancamentoFromUsuario() {
		Lancamento lancamento = new Lancamento();
		//lancamento.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id")));
		lancamento.setDescricao(JOptionPane.showInputDialog("Digite a descrição"));
		lancamento.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")));
		return lancamento;
		
	}
	
}
