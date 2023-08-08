package exerciciosLista1;

import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valorA, valorB, aux;
		
		System.out.println("Digite o valor da variável A");
		valorA = scan.nextDouble();
		System.out.println("Digite o valor da variável B");
		valorB = scan.nextDouble();
		
		aux = valorA;
		valorA = valorB;
		valorB = aux;
		
		System.out.println("Se programa bugou, o valor de A agora é " + valorA + " e o valor de B é " + valorB);
	}

}
