package exercicioPratico;

import java.util.Scanner;

public class QuestaoUm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double celcius, kelvin, reaumur, rankine, fahrenheit;
		
		System.out.println("Entre com a temperatura em celcius: ");
		celcius = scan.nextDouble();
		
		fahrenheit = celcius * 1.8 + 32;
		kelvin = celcius + 273.15;
		reaumur = celcius * 0.8;
		rankine = celcius * 1.8 + 32 + 459.67;
		
		System.out.printf("Temperatura %.1fCº%n", celcius);
		System.out.printf("Temperatura %.1fFº%n", fahrenheit);
		System.out.printf("Temperatura %.1fKº%n", kelvin);
		System.out.printf("Temperatura %.1fReº%n", reaumur);
		System.out.printf("Temperatura %.1fRaº", rankine);

	}

}
