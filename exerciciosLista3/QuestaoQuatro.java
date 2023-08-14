package exerciciosLista3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuestaoQuatro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome, pessoaMaisNova = "";
		int maiorIdade = 0, maisJovem = 999999999, idade = 0, totalIdade = 0;
		
		for(int i = 1; i <= 15; i++) {
			System.out.printf("Digite o nome da pessoa %d:%n", i);
			nome = scan.next();
			
			System.out.printf("Digite a idade da pessoa %d:%n", i);
			idade = scan.nextInt();
			
			if (idade > maiorIdade) {
				maiorIdade = idade;
			}
			
			if (idade < maisJovem) {
				maisJovem = idade;
				pessoaMaisNova = nome;
			}
			
			totalIdade += idade;
		}
		
		System.out.println("A maior idade é " + maiorIdade);
		System.out.println("O nome da pessoa mais jovem é " + pessoaMaisNova);
		System.out.println("A média das idades é " + (totalIdade / 15));
	}

}
