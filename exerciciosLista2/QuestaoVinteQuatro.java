package exerciciosLista2;

import java.util.Scanner;

public class QuestaoVinteQuatro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numero1, numero2, resultado;
		String operadores;

		System.out.println("Digite o primeiro número: ");
		numero1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		numero2 = scan.nextDouble();
		
		System.out.println("Digite qual operação (+, -, * ou /) deseja realizar: ");
		operadores = scan.next();
		
		if (operadores.equals("+")) {
			resultado = numero1 + numero2;
		} else if (operadores.equals("-")) {
			resultado = numero1 - numero2;
		} else if (operadores.equals("*")) {
			resultado = numero1 * numero2;
		} else if (operadores.equals("/")) {
			resultado = numero1 / numero2;
		} else {
			resultado = 0;
		}
		
		System.out.println("O resultado é: ");
		
		if (resultado % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
		
		if (resultado >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		
		if (resultado % 1 == 0) {
			System.out.println("Inteiro");
		} else {
			System.out.println("Decimal");
		}

		/*
		 * System.out
		 * .println("Escolha uma Opção: (1 - Par ou Impar? | 2 - Positivo ou Negativo? | 3 - Inteiro ou Decimal)"
		 * ); opcao = scan.nextInt();
		 * 
		 * switch (opcao) { case 1: { if (numero % 2 == 0) { System.out.println("Par");
		 * } else { System.out.println("Impar"); } break; } case 2: { if (numero < 0) {
		 * System.out.println("Negativo"); } else if (numero == 0) {
		 * System.out.println("0 é um valor vazio"); } else {
		 * System.out.println("Positivo"); } break; } case 3: { if (numero % 1 == 0) {
		 * System.out.println("Inteiro"); } else { System.out.println("Decimal"); }
		 * break; } default: System.out.println("Não existe essa opção."); }
		 */
	}

}
