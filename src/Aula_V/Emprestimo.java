package Aula_V;

import java.util.ArrayList;

public class Emprestimo {

	private ArrayList<String> livrosAlugados;

	private int dataEmprestimo;
	private int dataDevolucao;

	public ArrayList<String> getLivrosAlugados() {
		return livrosAlugados;
	}

	public void setLivrosAlugados(ArrayList<String> livrosAlugados) {
		this.livrosAlugados = livrosAlugados;
	}

	public int getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(int dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public int getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(int dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

}
