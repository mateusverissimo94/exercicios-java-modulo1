package exerciciosLista2;

import java.util.Scanner;

public class QuestaoTres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String genero;
		
		System.out.println("Digite seu genero: (F - feminino, M - masculino)");
		genero = scan.next();
		
		if(genero.toUpperCase().equals("F")) {
			System.out.println("Seu genero é feminino");
		} else if(genero.toUpperCase().equals("M")) {
			System.out.println("Seu genero é masculino");
		} else {
			System.out.println("Seu genero é não-binario");
		}
	}

}
