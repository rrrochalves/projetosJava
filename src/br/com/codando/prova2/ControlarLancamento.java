package br.com.codando.prova2;


import java.util.ArrayList;
import java.util.List;

public class ControlarLancamento implements IControlarLancamento{
	
	private List<Lancamento> listaLancamentos = new ArrayList<Lancamento>();
	private int indice;
	
	@Override
	public void inserirLancamento(Lancamento lancamento) {
		lancamento.setId(indice);
		listaLancamentos.add(lancamento);
		indice++;
	}

	@Override
	public String listarLancamentos() {
		String listaLancamentos = "-------------- Lista de Lan�amentos --------------\n";
		
		for (Lancamento lancamentoAux : this.listaLancamentos) {
			 	listaLancamentos += lancamentoAux + "\n";
		}
		
		return listaLancamentos.toString();
	}

	@Override
	public String listarLancamentoId(int id) {
		String lancamentoId = "------------------ Lan�amento ----------------------\n";
		
		for (Lancamento lancamento : listaLancamentos) {
			if(lancamento.getId() == id) {
				lancamentoId += lancamento + "\n";
				return lancamentoId.toString();
			}
		}
		
		lancamentoId = "N�o Existe esse Id";
		
		return lancamentoId;
	}

	@Override
	public String atualizarLancamento(int id, String descricao, Double valor) {
		for (Lancamento lancamento : listaLancamentos) {
			if(lancamento.getId() == id) {
				lancamento.setDescricao(descricao);
				lancamento.setValor(valor);
				return "Lancamento Atualizado!";
			}
		}
		return "Nao foi possivel atualizar o lancamento";
	}

	@Override
	public Boolean getLancamento(int id) {
		
		for (Lancamento lancamento : listaLancamentos) {
			if(lancamento.getId() == id) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String excluirLancamento(int id) {
		
			for (int i = 0; i < listaLancamentos.size(); i++) {
				Lancamento lancamento = listaLancamentos.get(i);
					if(lancamento.getId() == id) {
						listaLancamentos.remove(lancamento);
						return "Lan�amento de Id " + id + " Removido ";
					}
			}
			
		return "N�o foi possivel encontrar o Lan�amento de Id: " + id + " Digite um Id V�lido";
	}
	
}
