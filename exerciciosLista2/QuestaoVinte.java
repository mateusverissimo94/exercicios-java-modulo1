package exerciciosLista2;

import java.util.Scanner;

public class QuestaoVinte {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite o primeira nota: ");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite o segunda nota: ");
		nota2 = scan.nextDouble();
		
		System.out.println("Digite o terceira nota: ");
		nota3 = scan.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}

}
