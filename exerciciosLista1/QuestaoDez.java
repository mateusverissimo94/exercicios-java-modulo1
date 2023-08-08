package exerciciosLista1;

import java.util.Scanner;

public class QuestaoDez {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double custoFabrica, imposto, porcentagemDistribuidor, custoConsumidor;
		
		System.out.println("Custo de fabrica do carro: ");
		custoFabrica = scan.nextDouble();
		
		imposto = custoFabrica * 0.45;
		porcentagemDistribuidor = (custoFabrica + imposto) * 0.28;
		
		custoConsumidor = imposto + porcentagemDistribuidor;
		
		System.out.println("O custo ao consumidor de um carro novo é: " + custoConsumidor);
		
	} 
}
