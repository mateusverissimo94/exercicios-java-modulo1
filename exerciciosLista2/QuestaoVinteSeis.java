package exerciciosLista2;

import java.util.Scanner;

public class QuestaoVinteSeis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double litrosVendidos, valorPagar = 0;
		String combustivel;

		System.out.println("Digite quantos litros foram vendidos: ");
		litrosVendidos = scan.nextDouble();

		System.out.println("Digite o tipo dos combustível: (A - álcool , G - gasolina)");
		combustivel = scan.next();

		if (combustivel.toUpperCase().equals("A")) {
			valorPagar = litrosVendidos * 1.9;
			if (litrosVendidos <= 20) {
				valorPagar -= 1.9 * litrosVendidos * 0.03;
			} else {
				valorPagar -= 1.9 * litrosVendidos * 0.05;
			}
		} else if (combustivel.toUpperCase().equals("G")) {
			valorPagar = litrosVendidos * 2.5;
			if (litrosVendidos <= 20) {
				valorPagar -= 2.5 * litrosVendidos * 0.04;
			} else {
				valorPagar -= 2.5 * litrosVendidos * 0.06;
			}
		}

		System.out.printf("Valor a ser pago: %.2f", valorPagar);

	}

}
