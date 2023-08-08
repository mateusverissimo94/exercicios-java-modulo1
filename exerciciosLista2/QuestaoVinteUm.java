package exerciciosLista2;

import java.util.Scanner;

public class QuestaoVinteUm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor, dezena, unidade, celUm, celCinco, celDez, celCinquenta, celCem;

		System.out.println("Informa o valor do saque: ");
		valor = scan.nextInt();

		if (valor < 10) {
			System.out.println("O valor mínimo para saque é de R$10");
			System.exit(0);
		} else if (valor > 600) {
			System.out.println("O valor máximo para saque é de R$600");
			System.exit(0);
		}

		// separando em casas decimais
		unidade = valor % 10;
		valor = (valor - unidade) / 10;

		dezena = valor % 10;
		valor = (valor - dezena) / 10;

		celCem = valor;

		// contando a quantidade de cedulas
		celCinco = unidade / 5;
		if (celCinco > 0) {
			unidade = (unidade - 5);
		}
		celUm = unidade;

		celCinquenta = dezena / 5;
		if (celCinquenta > 0) {
			dezena = (dezena - 5);
		}
		celDez = dezena;

		if (celCem > 0) {
			System.out.println(celCem + " nota(s) de cem");
		}
		if (celCinquenta > 0) {
			System.out.println(celCinquenta + " nota(s) de ciquenta");
		}
		if (celDez > 0) {
			System.out.println(celDez + " nota(s) de dez");
		}
		if (celCinco > 0) {
			System.out.println(celCinco + " nota(s) de cinco");
		}
		if (celUm > 0) {
			System.out.println(celUm + " nota(s) de um");
		}

	}

}
