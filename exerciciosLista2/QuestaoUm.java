package exerciciosLista2;

import java.util.Scanner;

public class QuestaoUm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double primeiro, segundo;
		
		System.out.println("Digite o primeiro número: ");
		primeiro = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		segundo = scan.nextDouble();
		
		if(primeiro > segundo) {
			System.out.println("O " + primeiro + " é maior que " + segundo);
		} else {
			System.out.println("O " + segundo + " é maior que " + primeiro);
		}
	}

}
