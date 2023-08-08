package exerciciosLista2;

import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valor;
		
		System.out.println("Digite um número: ");
		valor = scan.nextDouble();
		
		if(valor < 0) {
			System.out.println("O número " + valor + " é negativo");
		} else if(valor == 0) {
			System.out.println("0 é um valor vazio");
		} else {
			System.out.println("O número " + valor + " é positivo");
		}

	}

}
