package exerciciosLista2;

import java.util.Scanner;

public class QuestaoSete {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double primeiro, segundo, terceiro;
		
		System.out.println("Digite o primeiro número: ");
		primeiro = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		segundo = scan.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		terceiro = scan.nextDouble();
		
		if(primeiro > segundo && primeiro > terceiro) {
			System.out.println(primeiro + " é o maior número");
		} else if (segundo > primeiro && segundo > terceiro) {
			System.out.println(segundo + " é o maior número");
		} else {
			System.out.println(terceiro + " é o maior número");
		}
		
		if(primeiro < segundo && primeiro < terceiro) {
			System.out.println(primeiro + " é o menor número");
		} else if (segundo < primeiro && segundo < terceiro) {
			System.out.println(segundo + " é o menor número");
		} else {
			System.out.println(terceiro + " é o menor número");
		}

	}

}
