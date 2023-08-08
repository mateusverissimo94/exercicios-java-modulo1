package exercicioPratico;

import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int gradeDeFuncionarios;
		double salario = 0, mediaDosSalarios;
		
		System.out.println("Quantos funcionarios tem na sua grade de trabalho: ");
		gradeDeFuncionarios = scan.nextInt();
		
		for(int i = 1; i <= gradeDeFuncionarios;i++) {
			System.out.printf("Coloque o salario do colaborador %d%n",i);
			salario += scan.nextDouble();
		}
		
		mediaDosSalarios = salario / gradeDeFuncionarios;
		
		System.out.printf("A média salarial da empresa é de %.2f", mediaDosSalarios);
	}

}
