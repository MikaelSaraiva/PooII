package Exercicio_1;

public class Curso_curto extends Aluno{

	private int mesEntrada;
	private double nota1;
	private double nota2;
	
	
	public double media() {
		return (nota1 + nota2)/2;
	}

	public String resultado() {
		String resultado = "Reprovado";
		
		if(media() >= 5)
			resultado = "Aprovado";
		
		return resultado;
	}
	
	
}
