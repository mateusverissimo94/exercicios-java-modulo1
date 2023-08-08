package exerciciosLista2;

import java.util.Scanner;

public class QuestaoNove {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double primeiro, segundo, terceiro, maior, menor, meio;
		
		System.out.println("Digite o primeiro número: ");
		primeiro = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		segundo = scan.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		terceiro = scan.nextDouble();

		if(primeiro > segundo && primeiro > terceiro) {
			maior = primeiro;
		} else if (segundo > primeiro && segundo > terceiro) {
			maior = segundo;
		} else {
			maior = terceiro;
		}
		
		if(primeiro < segundo && primeiro < terceiro) {
			menor = primeiro;
		} else if (segundo < primeiro && segundo < terceiro) {
			menor = segundo;
		} else {
			menor = terceiro;
		}
		
		if(maior == primeiro && menor == segundo) {
			meio = terceiro;
		} else if (maior == segundo && menor == terceiro) {
			meio = primeiro;
		} else  {
			meio = segundo;
		}
		
		System.out.println("Ordem decrescente: " + maior + ", " + meio + ", " + menor);
	}

}
