package Exercicio_1;

public class Curso_semestral extends Aluno {

	private int semestreEntrada;
	private double nota1;
	private double nota2;
	private double nota3;

	public Curso_semestral(String nome, int matricula, int anoEntrada) {
		super(nome, matricula, anoEntrada);
	}

	public int getSemestreEntrada() {
		return semestreEntrada;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setSemestreEntrada(int semestreEntrada) {
		this.semestreEntrada = semestreEntrada;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double media() {
		return ((nota1 * 0.25) * (nota2 * 0.25) * (nota3 * 0.50)) / 3;
	}

	public String resultado() {
		String resultado = "Reprovado";

		if (media() >= 6)
			resultado = "Aprovado";
		return resultado;
	}
}
