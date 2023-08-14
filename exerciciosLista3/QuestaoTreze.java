package exerciciosLista3;

import java.util.Scanner;

public class QuestaoTreze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sexo;
		double altura, totalAlturaMulheres = 0, totalMulheres = 0, maiorAltura = 0, menorAltura = 999999999;
		int numeroDeHomens = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o sexo da pessoa " + i + ": (M - masculino, F - feminino)");
			sexo = scan.next();
			
			System.out.println("Digite o altura da pessoa " + i + ":");
			altura = scan.nextDouble();
			
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			
			if (sexo.toUpperCase().equals("F")) {
				totalAlturaMulheres += altura;
				totalMulheres++;
			} else {
				numeroDeHomens++;
			}
		}
		
		System.out.println("A maior altura do grupo: " + maiorAltura);
		System.out.println("A menor Altura do grupo: " + menorAltura);
		System.out.println("A média da altura das mulhures: " + totalAlturaMulheres / totalMulheres);
		System.out.println("Total de homens no grupo: " + numeroDeHomens);
	}

}
