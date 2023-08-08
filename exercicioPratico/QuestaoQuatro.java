package exercicioPratico;

import java.util.Scanner;

public class QuestaoQuatro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double volume, raio, altura;
		
		System.out.println("Digite o valor do raio: ");
		raio = scan.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		altura = scan.nextDouble();
		
		volume = 3.14159 * (raio * raio) * altura;
		
		System.out.printf("O volume de uma lata de óleo é %.2f", volume);

	}

}
