package exerciciosLista2;

import java.util.Scanner;

public class QuestaoOnze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salarioAnterior, salarioReajustado, porcentagem, reajuste;

		System.out.println("Digite o salario do colaborador: ");
		salarioAnterior = scan.nextDouble();

//		if (salarioAnterior <= 280) {
//			porcentagem = 0.2;
//			reajuste = salarioAnterior * porcentagem;
//			salarioReajustado = salarioAnterior + reajuste;
//			System.out.println("Salario anterior: " + salarioAnterior + ", porcentagem aplicada para aumento: "
//					+ porcentagem + ", valor aumentado a partir do salario anterior: " + reajuste + ", valor do novo salario: " + salarioReajustado);
//		} else if(salarioAnterior > 280 && salarioAnterior <= 700) {
//			porcentagem = 0.15;
//			reajuste = salarioAnterior * porcentagem;
//			salarioReajustado = salarioAnterior + reajuste;
//			System.out.println("Salario anterior: " + salarioAnterior + ", porcentagem aplicada para aumento: "
//					+ porcentagem + ", valor aumentado a partir do salario anterior: " + reajuste + ", valor do novo salario: " + salarioReajustado);
//		} else if(salarioAnterior > 700 && salarioAnterior <= 1500) {
//			porcentagem = 0.1;
//			reajuste = salarioAnterior * porcentagem;
//			salarioReajustado = salarioAnterior + reajuste;
//			System.out.println("Salario anterior: " + salarioAnterior + ", porcentagem aplicada para aumento: "
//					+ porcentagem + ", valor aumentado a partir do salario anterior: " + reajuste + ", valor do novo salario: " + salarioReajustado);
//		} else {
//			porcentagem = 0.05;
//			reajuste = salarioAnterior * porcentagem;
//			salarioReajustado = salarioAnterior + reajuste;
//			System.out.println("Salario anterior: " + salarioAnterior + ", porcentagem aplicada para aumento: "
//					+ porcentagem + ", valor aumentado a partir do salario anterior: " + reajuste + ", valor do novo salario: " + salarioReajustado);
//		}

		if (salarioAnterior <= 280) {
			porcentagem = 0.2;
		} else if (salarioAnterior > 280 && salarioAnterior <= 700) {
			porcentagem = 0.15;
		} else if (salarioAnterior > 700 && salarioAnterior <= 1500) {
			porcentagem = 0.1;
		} else {
			porcentagem = 0.05;
		}

		reajuste = salarioAnterior * porcentagem;
		salarioReajustado = salarioAnterior + reajuste;
		System.out.println("Salario anterior: " + salarioAnterior + ", porcentagem aplicada para aumento: "
				+ porcentagem + ", valor aumentado a partir do salario anterior: " + reajuste
				+ ", valor do novo salario: " + salarioReajustado);
	}

}
