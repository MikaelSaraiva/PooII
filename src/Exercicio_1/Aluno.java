package Exercicio_1;

public abstract class Aluno {

	private String nome;
	private int matricula;
	private int anoEntrada;

	public Aluno(String nome, int matricula, int anoEntrada) {
		this.nome = nome;
		this.matricula = matricula;
		this.anoEntrada = anoEntrada;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public abstract double media();

	public abstract String resultado();
}
