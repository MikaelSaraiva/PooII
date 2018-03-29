package Exercicio_1;

import java.util.ArrayList;

public class Faculdade {

	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public void registrarAluno(String nome, int matricula, int anoEntrada) {
		for (int i = 0; i < alunos.size(); i++) {
			alunos.add(new Aluno(nome, matricula, anoEntrada));
		}
	}
	public String registro(String nomeAluno) {
		
		String registro = null;

		for (Aluno aluno : alunos) {
			if (aluno.getNome().equals(nomeAluno))
				registro = aluno.resultado();
			else
				registro = "Aluno não existe";
		}
		return registro;
	}
}
