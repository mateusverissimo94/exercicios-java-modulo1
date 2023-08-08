package exerciciosLista1;

import java.util.Scanner;

public class ConsumoMedio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a distância percorrida pelo carro: ");
		double distancia = scan.nextDouble();
		
		System.out.println("Digite o total de combustível gasto: ");
		double combustivel = scan.nextDouble();
		
		double consumo = distancia/combustivel;
		
		System.out.printf("O carro percorreu %.2f KM e gastou %.2f L, logo o consumo médio dele é de %.2f.%n", distancia, combustivel, consumo);
	}
}
