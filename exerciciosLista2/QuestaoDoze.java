package exerciciosLista2;

import java.util.Scanner;

public class QuestaoDoze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int horasTrabalhadas;
		double meuValor, fgts, sindicato, desconto, salarioLiquido, salarioBruto, ir = 0;

		System.out.println("Digite o valor pela sua hora trabalhada: ");
		meuValor = scan.nextDouble();

		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		horasTrabalhadas = scan.nextInt();

		salarioBruto = meuValor * horasTrabalhadas;

//		if (salarioBruto <= 900) {
//			sindicato = salarioBruto * 0.3;
//			fgts = salarioBruto * 0.11;
//			desconto = sindicato;
//			salarioLiquido = salarioBruto - desconto;
//			System.out.printf("Salario Bruto (%.0f * %d) : R$ %.2f%n", meuValor, horasTrabalhadas, salarioBruto);
//			System.out.printf("(-) IR : Isento%n");
//			System.out.printf("(-) Sindicato : R$ %.2f%n", sindicato);
//			System.out.printf("FGTS : R$ %.2f%n", fgts);
//			System.out.printf("Total de descontos : R$ %.2f", desconto);
//			System.out.printf("Salario Liquido : R$ %.2f", salarioLiquido);
//		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
//			sindicato = salarioBruto * 0.03;
//			ir = salarioBruto * 0.05;
//			fgts = salarioBruto * 0.11;
//			desconto = sindicato + ir;
//			salarioLiquido = salarioBruto - desconto;
//			System.out.printf("Salario Bruto (%.0f * %d) : R$ %.2f%n", meuValor, horasTrabalhadas, salarioBruto);
//			System.out.printf("(-) IR : R$ %.2f%n", ir);
//			System.out.printf("(-) Sindicato : R$ %.2f%n", sindicato);
//			System.out.printf("FGTS : R$ %.2f%n", fgts);
//			System.out.printf("Total de descontos : R$ %.2f", desconto);
//			System.out.printf("Salario Liquido : R$ %.2f", salarioLiquido);
//		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
//			sindicato = salarioBruto * 0.03;
//			ir = salarioBruto * 0.1;
//			fgts = salarioBruto * 0.11;
//			desconto = sindicato + ir;
//			salarioLiquido = salarioBruto - desconto;
//			System.out.printf("Salario Bruto (%.0f * %d) : R$ %.2f%n", meuValor, horasTrabalhadas, salarioBruto);
//			System.out.printf("(-) IR : R$ %.2f%n", ir);
//			System.out.printf("(-) Sindicato : R$ %.2f%n", sindicato);
//			System.out.printf("FGTS : R$ %.2f%n", fgts);
//			System.out.printf("Total de descontos : R$ %.2f", desconto);
//			System.out.printf("Salario Liquido : R$ %.2f", salarioLiquido);
//		} else if (salarioBruto > 2500) {
//			sindicato = salarioBruto * 0.03;
//			ir = salarioBruto * 0.2;
//			fgts = salarioBruto * 0.11;
//			desconto = sindicato + ir;
//			salarioLiquido = salarioBruto - desconto;
//			System.out.printf("Salario Bruto (%.0f * %d) : R$ %.2f%n", meuValor, horasTrabalhadas, salarioBruto);
//			System.out.printf("(-) IR : R$ %.2f%n", ir);
//			System.out.printf("(-) Sindicato : R$ %.2f%n", sindicato);
//			System.out.printf("FGTS : R$ %.2f%n", fgts);
//			System.out.printf("Total de descontos : R$ %.2f", desconto);
//			System.out.printf("Salario Liquido : R$ %.2f", salarioLiquido);
//		}
		
		if (salarioBruto <= 900) {
			ir = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			ir = salarioBruto * 0.05;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			ir = salarioBruto * 0.1;
		} else if (salarioBruto > 2500) {
			ir = salarioBruto * 0.2;
		}
		
		sindicato = salarioBruto * 0.03;
		fgts = salarioBruto * 0.11;
		desconto = sindicato + ir;
		salarioLiquido = salarioBruto - desconto;
		System.out.printf("Salario Bruto (%.0f * %d) : R$ %.2f%n", meuValor, horasTrabalhadas, salarioBruto);
		System.out.printf("(-) IR : R$ %.2f%n", ir);
		System.out.printf("(-) Sindicato : R$ %.2f%n", sindicato);
		System.out.printf("FGTS : R$ %.2f%n", fgts);
		System.out.printf("Total de descontos : R$ %.2f%n", desconto);
		System.out.printf("Salario Liquido : R$ %.2f", salarioLiquido);
	}

}
