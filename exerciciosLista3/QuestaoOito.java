package exerciciosLista3;

import java.util.Scanner;

public class QuestaoOito {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade, linhaIdade = 0, idadeTotal = 0;
		double media;
		
		while(true) {
			System.out.printf("Digite a idade da linha %d: (0 para sair)%n", linhaIdade + 1);
			idade = scan.nextInt();
			
			if (idade != 0) {
				idadeTotal += idade;
				linhaIdade++;
			} else {
				break;
			}
		}
		
		System.out.println(idadeTotal);
		System.out.println(linhaIdade);
		
		media = (double) idadeTotal / linhaIdade;
		
		System.out.println("A média das idades: " + media);
	}

}
