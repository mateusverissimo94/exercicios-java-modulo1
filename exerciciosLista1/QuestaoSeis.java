package exerciciosLista1;

import java.util.Scanner;

public class QuestaoSeis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valor;
		
		System.out.println("Digite o valor da compra: ");
		valor = scan.nextDouble();
		
		System.out.printf("%.2f em 1 prestação%n", valor);
		System.out.printf("%.2f em 2 prestações%n", valor / 2);
		System.out.printf("%.2f em 3 prestações%n", valor / 3);
		System.out.printf("%.2f em 4 prestações%n", valor / 4);
		System.out.printf("%.2f em 5 prestações", valor / 5);
	}

}
