package exerciciosLista2;

import java.util.Scanner;

public class QuestaoDezesseis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double delta, x, raiz1, raiz2, a, b, c;
		
		System.out.println("Digite o valor de a");
		a = scan.nextDouble();
		
		if(a == 0) {
			System.out.println("a equação não é mais de segundo grau.");
			System.exit(0);
		}
		
		System.out.println("Digite o valor de b");
		b = scan.nextDouble();
		
		System.out.println("Digite o valor de c");
		c = scan.nextDouble();
		
		delta = (b*b) - (4*a*c);
		
		if (delta < 0) {
			System.out.println("a equação não possui raizes reais.");
		} else if (delta == 0) {
			x = ((-1)*b) / (2*a);
			System.out.printf("a equação possui apenas uma raiz real: %.2f", x);
		} else {
			raiz1 = (((-1)*b) + Math.sqrt(delta)) / (2*a);
			raiz2 = (((-1)*b) - Math.sqrt(delta)) / (2*a);
			System.out.printf("as raizes da equação são: %.2f, %.2f", raiz1, raiz2);
		}
	}

}
