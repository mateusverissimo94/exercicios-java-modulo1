package exerciciosLista3;

import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		int soma = 0, inteiros = 1;
		
		while(inteiros < 19) {
			if(inteiros == 18) {
				System.out.printf(inteiros + "%n");
			} else {
				System.out.printf(inteiros + " + ");
			}
			soma += inteiros;
			inteiros++;
		}
		System.out.println("Valor da soma: " + soma);

	}

}
