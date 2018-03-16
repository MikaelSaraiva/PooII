package Aula_II;

import java.util.Scanner;

public class AulaII_Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numLine = 0;
		int numColumn = 0;
		int userSelection = -1;
		boolean user = true;
		String userSelection1 = null;
		AulaII_OperacoesNumeros operar = null;


		while (userSelection != 0) {

//			System.out.println("**Menu**");
//			System.out.println("");
//			System.out.println("(0)Sair");
//			System.out.println("(1)Criar matriz.");
//			System.out.println("");
//			System.out.print("Escreva aqui: ");
//			if (user == true)
//				userSelection = input.nextInt();
//			System.out.println("");
//
//			if (userSelection == 1) {
//				System.out.println("**Criando Matriz**");
//				System.out.println("");
//
//				boolean deuBom = false;
//				while (!deuBom) {
//					System.out.print("Número de linhas: ");
//					numLine = input.nextInt();
//					System.out.print("Número de colunas: ");
//					numColumn = input.nextInt();
//					System.out.println("");
//					if (numLine <= 0 || numColumn <= 0) {
//						System.out.println("Você fez merda, tente novamente: ");
//						userSelection = 1;
//					} else {
//						deuBom = true;
//						MatrizDeInt matriz = new MatrizDeInt(numLine, numColumn);
//						while (userSelection != 0 && matriz != null) {
							if (user == true) {
								System.out.println("**Menu**");
								System.out.println("");
								System.out.println("(0)Sair.");
								System.out.println("(1)Verifica positivo negativo.");
								System.out.println("(2)Soma entre um intervalo.");
								System.out.println("(3)somar todos os inteiros entre B e C que sejam divisíveis por A.");
								System.out.println("(4)Conversão de segundo para horas, minutos e segundos.");
								System.out.println("");
								System.out.print("Escreva aqui: ");
								userSelection = input.nextInt();
								System.out.println("");
								System.out.print("");

							}

							if (userSelection == 1) {
								System.out.println("**Opção 1**");
								System.out.println("");
								System.out.print("Digite seu número aqui: ");
								int n1 = input.nextInt();
								operar.positivoOuNao(n1);
								System.out.println(operar);
								
//							
//							} else if (userSelection == 2) {
//								System.out.println("**Opção 2**");
//								System.out.println("");
//
//								System.out.println("Sua matriz: ");
//								System.out.println(matriz);
//
//							} else if (userSelection == 3) {
//								System.out.println("**Opção 3**");
//								System.out.println("");
//								System.out.print("Número da linha: ");
//								numLine = input.nextInt();
//								System.out.print("Número da coluna: ");
//								numColumn = input.nextInt();
//								System.out.print("Valor: ");
//								int n = input.nextInt();
//								if (numLine > matriz.getNumLine() || numColumn > matriz.getNumColumn() || numLine <= 0
//										|| numColumn <= 0) {
//									System.out.println("Você fez merda, tente novamente.");
//									user = false;
//									userSelection = 3;
//								} else {
//									matriz.setValue(numLine, numColumn, n);
//									System.out.print("Deseja realizar outra troca?(s/n): ");
//									userSelection1 = input.next();
//									if (userSelection1.equals("s")) {
//										user = false;
//										userSelection = 3;
//									} else if (userSelection1.equals("n"))
//										user = true;
//
//								}
//
//							} else if (userSelection == 4) {
//								System.out.println("**Opção 4**");
//								System.out.println("");
//								System.out.print("Soma: " + matriz.getSumAll());
//								System.out.println("");
//								System.out.println("");
//
//							} else if (userSelection == 5) {
//								System.out.println("**Opção 5**");
//								System.out.println("");
//								System.out.print("Número da linha: ");
//								numLine = input.nextInt();
//								if (numLine > matriz.getNumLine() || numLine <= 0) {
//									System.out.println("Você fez merda, tente novamente.");
//									System.out.println("");
//									System.out.println("");
//
//									user = false;
//									userSelection = 5;
//								} else {
//									System.out.println("Soma: " + matriz.getSumLine(numLine));
//									System.out.println("Deseja realizar outra soma?(s/n): ");
//									userSelection1 = input.next();
//									if (userSelection1.equals("s")) {
//										user = false;
//										userSelection = 5;
//
//									} else if (userSelection1.equals("n"))
//										user = true;
//								}
//							}
//						}
//					}
//				}
			}
		}

		input.close();
	}

}
