package exerciciosLista2;

import java.util.Scanner;

public class QuestaoVinteOito {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double kilo, valorTotal = 0, desconto;
		String tipoCarne, pagamento;

		System.out.println("Escolha uma das carnes da promoção: (F - Filé Duplo, A - Alcatra, P - Picanha)");
		tipoCarne = scan.next();
		
		System.out.println("Digite quantos Kg você vai comprar: ");
		kilo = scan.nextDouble();
		
		System.out.println("Dinheiro ou cartão da loja (5% de desconto)? D ou C: ");
		pagamento = scan.next();
		
		System.out.println("Hipermercado Tabajara Cupom fiscal");
		if (tipoCarne.toUpperCase().equals("F")) {
			System.out.println("Item: Filé Duplo");
			if (kilo > 5) {
				valorTotal = kilo * 5.8;
			} else {
				valorTotal = kilo * 4.9;
			}
		} else if (tipoCarne.toUpperCase().equals("A")) {
			System.out.println("Item: Alcatra");
			if (kilo > 5) {
				valorTotal = kilo * 6.8;
			} else {
				valorTotal = kilo * 5.9;
			}
		} else if (tipoCarne.toUpperCase().equals("P")) {
			System.out.println("Item: Picanha");
			if (kilo > 5) {
				valorTotal = kilo * 7.8;
			} else {
				valorTotal = kilo * 6.9;
			}
		}
		
		System.out.printf("Quantidade: %.2fKg%n", kilo);
		System.out.printf("Preço total: R$%.2f%n", valorTotal);
		
		if (pagamento.toUpperCase().equals("D")) {
			System.out.println("Tipo de pagamento: Dinheiro");
			desconto = 0;
			System.out.println("Desconto: R$0");
			System.out.printf("Valor a pagar: R$%.2f%n", valorTotal);
		} else if (pagamento.toUpperCase().equals("C")) {
			System.out.println("Tipo de pagamento: Cartão Tabajara");
			desconto = valorTotal * 0.05;
			System.out.printf("Desconto: R$%.2f%n", desconto);
			System.out.printf("Valor a pagar: R$%.2f%n", (valorTotal - desconto));
		}
		
	}

}
