package exerciciosLista1;

import java.util.Scanner;

public class QuestaoNove {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ano, mes, dia;
		
		System.out.println("Informe sua idade: ");
		System.out.println("Anos: ");
		ano = scan.nextInt();
		
		System.out.println("Meses: ");
		mes = scan.nextInt();
		
		System.out.println("Dias: ");
		dia = scan.nextInt();
		
		dia += (ano * 365) + (mes * 30);
		
		System.out.println("Sua idade em dias é " + dia);

	}

}
