package exerciciosLista2;

import java.util.Scanner;

public class QuestaoDezessete {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ano;

		System.out.println("Digite um ano: ");
		ano = scan.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("Esse ano é Bissexto");
		} else {
			System.out.println("Esse ano não é Bissexto");
		}
	}

}
