package exerciciosLista1;

import java.util.Scanner;

public class QuestaoCinco {

	public static void main(String[] args) {
		// Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. Considere fixo o juro da poupança em 0,50% a. m.
		Scanner scan = new Scanner(System.in);
		double deposito, rendimento;
		
		System.out.println("Deposite seu dinheiro: ");
		deposito = scan.nextDouble();
		
		rendimento = deposito + (deposito * 0.5);
		
		System.out.println(rendimento);
	}

}
