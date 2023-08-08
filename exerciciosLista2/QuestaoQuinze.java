package exerciciosLista2;

import java.util.Scanner;

public class QuestaoQuinze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double lado1, lado2, lado3;

		System.out.println("Digite o valor do primeiro lado: ");
		lado1 = scan.nextDouble();
		
		System.out.println("Digite o valor do segundo lado: ");
		lado2 = scan.nextDouble();
		
		System.out.println("Digite o valor do terceiro lado: ");
		lado3 = scan.nextDouble();
		
		if((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 || (lado3 + lado1) > lado2) {
			if(lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero");
			} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				System.out.println("Triângulo Isósceles");
			} else {
				System.out.println("Triângulo Escaleno");
			}
		} else {
			System.out.println("Não é um Triângulo");
		}
	}

}
