import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class AulaIII_Controle {

	public static void main(String[] args) {

		
		Random random = new Random();

		// // Atividade 1
		//
		// int[] resposta = new int[11];
		// resposta[1] = 1;
		//
		// System.out.println(resposta[1]);
		// for (int i = 2; i < resposta.length; i++) {
		// resposta[i] = resposta[i - 1] + resposta[i - 2];
		// System.out.println(resposta[i]);
		// }
		// System.out.println("");
		//
		// // Atividade 2
		//
		// int[] notas = new int[6];
		// int rec = 0;
		// int aprovados = 0;
		// int reprovados = 0;
		// int mediaAux = 0;
		// int media = 0;
		//
		// for (int i = 0; i < notas.length; i++) {
		// System.out.print("Coloque a primeira nota do aluno: ");
		// int nota1 = input.nextInt();
		// System.out.print("Coloque a segunda nota do aluno: ");
		// int nota2 = input.nextInt();
		// notas[i] = (nota1 + nota2) / 2;
		//
		// if (notas[i] > 3 && notas[i] < 6) {
		// rec++;
		// } else if (notas[i] > 6) {
		// aprovados++;
		// } else
		// reprovados++;
		//
		// mediaAux += notas[i];
		// media = mediaAux / notas.length;
		// }
		//
		// System.out.println("");
		// System.out.print("Alunos em recuperação: " + rec);
		// System.out.println("");
		// System.out.print("Alunos aprovados: " + aprovados);
		// System.out.println("");
		// System.out.print("Alunos reprovados: " + reprovados);
		// System.out.print("Média da turma: " + media);
		// System.out.println("");
		//
		//// Atividade 3
		//
		// int n = input.nextInt();
		// int divide = 0;
		// String verificador = null;
		//
		// for (int i = 1; i <= Math.sqrt(n); i++) {
		// if(n % i == 0) {
		// divide++;
		// if (divide > 2) {
		// verificador = "O número " + String.valueOf(n) + " não é primo";
		// break;
		// }
		// else
		// verificador = "O número " + String.valueOf(n) + " é primo";
		// break;
		//
		//
		// }
		// }//
//		// Atividade 4

		// System.out.println(verificador);
		//
		// // Atividade 4

		// ArrayList<Double> notas = new ArrayList<Double>();
		// ArrayList<Double> freq= new ArrayList<Double>();
		// int numFaltas = 0;
		// int numPresenca = 18 - numFaltas;
		// double n1, n2;
		//
		// for (int i = 0; i < notas.size(); i++) {
		// notas.add((n1 + n2) / 2);
		// freq.add((numPresenca/18)*100);
		//
		// }

		int[] v5 = new int[5];
		int[] v10 = new int[10];
		int[][] v4x3 = new int[4][3];
		
		System.out.print("Vetor 1: ");
		for (int i = 0; i < v5.length; i++) {
			v5[i] = random.nextInt(10);
			System.out.print(v5[i] + ",");
		}
		System.out.println("");
		System.out.print("Vetor 2: ");
		for (int i = 0; i < v10.length; i++) {
			v10[i] = random.nextInt(10);
			System.out.print(v10[i] + ",");
		}
		System.out.println("");
		System.out.print("Vetor 3: ");
		for (int i = 0; i < v4x3.length; i++) {
			System.out.print(v4x3[1][1]);
			for (int j = 0; j < v4x3[0].length; j++) {
				v4x3[i][j] = random.nextInt(10);
				System.out.print(v4x3[1][1]);
			}
		}
	}
}