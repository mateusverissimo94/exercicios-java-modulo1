package exerciciosLista1;

import java.util.Scanner;

public class QuestaoQuatro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double cotacao, dolares, real;
		
		System.out.println("Digite a cotação do dólar de hoje: ");
		cotacao = scan.nextDouble();
		
		System.out.println("Digite a quantidade de dólares disponível com você: ");
		dolares = scan.nextDouble();
		
		real = cotacao * dolares;
		
		System.out.printf("A conversão para Real(R$) foi de %.2f%n", real);
	}

}
