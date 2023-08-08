package exerciciosLista2;

import java.util.Scanner;

public class QuestaoQuatorze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, media;
		String conceito;
		
		System.out.println("Digite a primeira nota parcial: ");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota parcial: ");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 9) {
			System.out.printf("Notas: %.1f, %.1f | Media: %.1f | Conceito: A | Aprovado ", nota1, nota2, media);
		} else if(media >= 7.5 && media < 9) {
			System.out.printf("Notas: %.1f, %.1f | Media: %.1f | Conceito: B | Aprovado ", nota1, nota2, media);
		} else if(media >= 6 && media < 7.5) {
			System.out.printf("Notas: %.1f, %.1f | Media: %.1f | Conceito: C | Aprovado ", nota1, nota2, media);
		} else if(media >= 4 && media < 6) {
			System.out.printf("Notas: %.1f, %.1f | Media: %.1f | Conceito: D | Reprovado ", nota1, nota2, media);
		} else {
			System.out.printf("Notas: %.1f, %.1f | Media: %.1f | Conceito: E | Reprovado ", nota1, nota2, media);
		}
	}

}
