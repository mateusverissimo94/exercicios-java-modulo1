package exerciciosLista3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestaoDez {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<>();
		int valoresFinais = 0, decrescimo, contador = 0;

		while (valores.contains(0) != true) {
			System.out.println("Digite um valor (0 para parar): ");
			valores.add(scan.nextInt());
		}

		if (valores.size() > 11) {
			for (decrescimo = 2; decrescimo < 12; decrescimo++) {
				valoresFinais += valores.get(valores.size() - decrescimo);
			}
		} else {
			for (int i : valores) {
				if (i != 0) {
					valoresFinais += i;
					contador++;
					if (contador == 10) {
						break;
					}
				}
			}
		}
		
		System.out.println("A soma dos 10 últimos valores inseridos é " + valoresFinais);
		System.out.println("A média dos 10 últimos valores inseridos é " + (valoresFinais / contador));

	}

}
