package exerciciosLista1;

import java.util.Scanner;

public class QuestaoOito {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		double salario, totalVendas, comissao, salarioComComissao;

		System.out.println("Nome do vendedor: ");
		nome = scan.next();

		System.out.println("Salario do vendedor: ");
		salario = scan.nextDouble();

		System.out.println("Valor total das vendas feitas no mês: ");
		totalVendas = scan.nextDouble();

		comissao = totalVendas * 0.15;
		salarioComComissao = salario + comissao;

		System.out.println("Nome do vendedor: " + nome + ", salario fixo:  " + salario
				+ ", salario no final do mês com comissão: " + salarioComComissao);
	}
}
