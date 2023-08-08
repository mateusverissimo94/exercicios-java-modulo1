package exerciciosLista2;

import java.util.Scanner;

public class QuestaoQuatro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		String letra, vogal = "aeiou";
		
		System.out.println("Digite uma letra: ");
		letra = scan.next();
		
		for (int i = 0; i < vogal.length(); i++) {
			if(letra.toLowerCase().equals(vogal.substring(i,i+1))) {
				System.out.println(letra + " é uma vogal");
				count++;
				break;
			}
		}
		
		if(count == 0) {
			System.out.println(letra + " é uma consoante");
		}
		
	}

}
