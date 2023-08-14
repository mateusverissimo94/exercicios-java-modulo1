package exerciciosLista3;

import java.util.Scanner;

public class QuestaoUm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] idades = new int[20];
		double media, total = 0;
		int contador = 0;
		
		for(int i = 0; i < idades.length; i++){
			System.out.printf("Digite uma idade %d:%n", i+1);
			idades[i] = scan.nextInt();
		}
		
//		while (contador < 20) {
//			System.out.printf("Digite uma idade %d:%n", contador+1);
//			idades[contador] = scan.nextInt();
//		}
		
		for (int i : idades) {
			total += i;
		}
		
		media = total / 20;
		
		System.out.printf("Media Aritmetica: %.2f", media);
	}

}
