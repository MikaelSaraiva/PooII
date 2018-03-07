import java.util.Scanner;

public class AulaII_Controle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] resposta = new int[11];
		int aux = 1;
		resposta[1] = 1;

		System.out.println(resposta[1]);
		for (int i = 2; i < resposta.length; i++) {
			resposta[i] = resposta[i - 1] + resposta[i - 2];
			System.out.println(resposta[i]);
			aux++;
		}

		int[] alunos = new int[6];
		int[] notas = new int[6];
		int rec = 0;
		int aprovados = 0;
		int reprovados = 0;
		int mediaAux = 0;
		int media = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Coloque a primeira nota do aluno: ");
			int nota1 = input.nextInt();
			System.out.print("Coloque a segunda nota do aluno: ");
			int nota2 = input.nextInt();
			notas[i] = (nota1 + nota2) / 2;

			if (notas[i] > 3 && notas[i] < 6) {
				rec++;
			} else if (notas[i] > 6) {
				aprovados++;
			} else
				reprovados++;

			mediaAux += notas[i];
			media = mediaAux / notas.length;
		}

		System.out.println("");
		System.out.print("Alunos em recuperação: " + rec);
		System.out.println("");
		System.out.print("Alunos aprovados: " + aprovados);
		System.out.println("");
		System.out.print("Alunos reprovados: " + reprovados);
		System.out.print("Média da turma: " + media);
	}
}