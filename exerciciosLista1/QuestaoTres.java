package exerciciosLista1;

import java.util.Scanner;

public class QuestaoTres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double c, f;
		
		System.out.println("Digite uma temperatura em Celcius(Cº)");
		c = scan.nextDouble();
		
		f = (9*c+160)/5;
		
		//System.out.println("Você digitou " + c + " Cº, que em Fahrenheit é " + f + " Fº");
		System.out.printf("Você digitou %.1f Cº, que em Fahrenheit é %.1f Fº%n", c, f);
	}

}
