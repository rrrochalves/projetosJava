package br.com.codando.prova2;

public interface IControlarLancamento {
	
	void inserirLancamento(Lancamento lancamento);
	String listarLancamentos();
	String listarLancamentoId(int id);
	String atualizarLancamento(int id, String descricao, Double valor);
	Boolean getLancamento(int id);
	String excluirLancamento(int id);
}
