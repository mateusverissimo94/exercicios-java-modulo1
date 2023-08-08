package exerciciosLista2;

import java.util.Scanner;

public class QuestaoVinteSete {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double kiloMorango, kiloMaca, valorCompra;
		
		System.out.println("Digite o Kg do morango: ");
		kiloMorango = scan.nextDouble();
		
		System.out.println("Digite o Kg do maçã: ");
		kiloMaca = scan.nextDouble();
		
		if(kiloMorango > 5) {
			valorCompra = kiloMorango * 2.2;
		} else {
			valorCompra = kiloMorango * 2.5;
		}
		
		if(kiloMaca > 5) {
			valorCompra = kiloMaca * 1.5;
		} else {
			valorCompra = kiloMaca * 1.8;
		}
		
		if ((kiloMaca + kiloMorango) > 8 || valorCompra > 25) {
			valorCompra -= 	valorCompra * 0.1;
		}
		
		System.out.printf("o valor da compra é: %.2f", valorCompra);

	}

}
