package exerciciosLista2;

import java.util.Scanner;

public class QuestaoTreze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int diasSemana;
		
		System.out.println("Digite um número");
		diasSemana = scan.nextInt();
		
		switch (diasSemana) {
		case 1:
			System.out.println("1 é domingo");
			break;
		case 2:
			System.out.println("2 é segunda-feira");
			break;
		case 3:
			System.out.println("3 é terça-feira");
			break;
		case 4:
			System.out.println("4 é quarta-feira");
			break;
		case 5:
			System.out.println("5 é quinta-feira");
			break;
		case 6:
			System.out.println("6 é sexta-feira");
			break;
		case 7:
			System.out.println("7 é sábado");
			break;
		default:
			System.out.println("Não existe esse dia da semana");
		}
	}

}
