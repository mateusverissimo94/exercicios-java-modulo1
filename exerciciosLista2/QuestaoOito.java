package exerciciosLista2;

import java.util.Scanner;

public class QuestaoOito {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double preco1, preco2, preco3;
		
		System.out.println("Digite o preço do produto 1: ");
		preco1 = scan.nextDouble();
		
		System.out.println("Digite o preço do produto 2: ");
		preco2 = scan.nextDouble();
		
		System.out.println("Digite o preço do produto 3: ");
		preco3 = scan.nextDouble();
		
		if(preco1 < preco2 && preco1 < preco3) {
			System.out.println("O preço do produto 1 de " + preco1 + " é o mais barato, compre-o");
		} else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println("O preço do produto 2 de " + preco2 + " é o mais barato, compre-o");
		} else {
			System.out.println("O preço do produto 3 de " + preco3 + " é o mais barato, compre-o");
		}

	}

}
