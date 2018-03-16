package Aula_V;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Emprestimo> emprestimos;
	private String name;

	public void emprestar(int codigo, String pessoa, int cpf) {
	}

	public void receber(int codigo) {

	}

	public ArrayList<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
