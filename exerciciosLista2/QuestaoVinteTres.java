package exerciciosLista2;

import java.util.Scanner;

public class QuestaoVinteTres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numero;

		System.out.println("Digite um número: ");
		numero = scan.nextDouble();

		if (numero % 1 == 0) {
			System.out.println("Inteiro");
		} else {
			System.out.println("Decimal");
		}

	}

}
