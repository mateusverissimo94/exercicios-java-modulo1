package exerciciosLista1;

import java.util.Scanner;

public class QuestaoSete {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double produto, valorFinal, porcentagem;
		
		System.out.println("Digite o valor do produto: ");
		produto = scan.nextDouble();
		
		System.out.println("Acrescimo de porcentagem do produto: ");
		porcentagem = scan.nextDouble();
		
		valorFinal = produto + (produto * (porcentagem/100));
		
		System.out.println("O preço de custo do produto é " + valorFinal);
	}

}
