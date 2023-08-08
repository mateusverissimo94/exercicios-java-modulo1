package exerciciosLista1;

import java.util.Scanner;

public class QuestaoUm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int primeiroNumero, segundoNumero;
		
		System.out.println("Digite o primeiro número: ");
		primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		segundoNumero = scan.nextInt();
		
		System.out.println("A soma dos números "+ primeiroNumero + " e " + segundoNumero + " é: " + (primeiroNumero + segundoNumero));
		System.out.println("A subtração dos números "+ primeiroNumero + " e " + segundoNumero + " é: " + (primeiroNumero - segundoNumero));
		System.out.println("A multiplicação dos números "+ primeiroNumero + " e " + segundoNumero + " é: " + (primeiroNumero * segundoNumero));
		System.out.println("A divisão dos números "+ primeiroNumero + " e " + segundoNumero + " é: " + (primeiroNumero / segundoNumero));
	}

}
