package exerciciosLista3;

import java.util.Scanner;

public class QuestaoOnze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valorDoIntervalo, estaNoIntervalo = 0, naoEstaNoIntervalo = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o número " + i + ":");
			valorDoIntervalo = scan.nextInt();
			
			if(valorDoIntervalo > 10 && valorDoIntervalo < 20) {
				estaNoIntervalo++;
			} else {
				naoEstaNoIntervalo++;
			}
		}
		
		System.out.println("Total de números que estam no intervalo fechado entre 10 e 20: " + estaNoIntervalo);
		System.out.println("Total de números que não estam no intervalo fechado entre 10 e 20: " + estaNoIntervalo);

	}

}
