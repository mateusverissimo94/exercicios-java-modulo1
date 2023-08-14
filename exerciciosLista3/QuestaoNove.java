package exerciciosLista3;

import java.util.Scanner;

public class QuestaoNove {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, totalNumeros = 0, numeroPar = 0, numeroImpar = 0, posicao = 1;
		double porcentagemPar, porcentagemImpar;

		while(true) {
			System.out.println("Digite o número " + posicao + ":");
			numero = scan.nextInt();
			
			if (numero == 99) {
				break;
			}
			
			posicao++; 
			totalNumeros++;
			
			if(numero % 2 == 0) {
				numeroPar++;
			} else {
				numeroImpar++;
			}
		}
		
		porcentagemPar = (double) numeroPar / totalNumeros * 100;
		porcentagemImpar = (double) numeroImpar / totalNumeros * 100;
		
		System.out.println("Porcentagem de números par: " + porcentagemPar + "%");
		System.out.println("Porcentagem de números impar: " + porcentagemImpar + "%");
	}

}
