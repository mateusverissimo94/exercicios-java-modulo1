package exerciciosLista1;

import java.util.Scanner;

public class QuestaoOnze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, centena, dezena, unidade;
		
		System.out.println("Informe um número positivo, menor que 1000: ");
		numero = scan.nextInt();
		
		unidade = numero % 10;
		
		numero = (numero - unidade) / 10;
		
		dezena = numero % 10;
		
		numero = (numero - dezena) / 10;
		
		centena = numero;
		
		System.out.println("Centena = " + centena + ", Dezena = " + dezena + " e Unidade = " + unidade);
	}

}
