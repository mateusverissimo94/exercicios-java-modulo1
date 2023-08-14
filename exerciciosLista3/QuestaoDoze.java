package exerciciosLista3;

import java.util.Scanner;

public class QuestaoDoze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int matricula;
		double salarioFixo, totalVendas, comissaoTresPorcento, comissaoCincoPorcento, salarioTotal;
		
		while(true) {
			System.out.println("Digite a matrícula do vendedor: ");
			matricula = scan.nextInt();
			
			if (matricula == 99) {
				break;
			}
			
			System.out.println("Digite o salário do vendedor: ");
			salarioFixo = scan.nextDouble();
			
			System.out.println("Digite o total de vendas: ");
			totalVendas = scan.nextDouble();
			
			if(totalVendas <= 1000) {
				comissaoTresPorcento = totalVendas * 0.03;
				salarioTotal = salarioFixo + comissaoTresPorcento;
			} else {
				comissaoTresPorcento = 1000 * 0.03;
				comissaoCincoPorcento = (totalVendas - 1000) * 0.05;
				salarioTotal = salarioFixo + comissaoTresPorcento + comissaoCincoPorcento;
			}
			
			System.out.println("Matricula do vendedor: " + matricula);
			System.out.printf("Salário fixo: %.2f%n", salarioFixo);
			System.out.printf("Salario Total: %.2f%n", salarioTotal);
		}
	}

}
