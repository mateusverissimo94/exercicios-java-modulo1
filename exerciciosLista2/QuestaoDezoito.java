package exerciciosLista2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuestaoDezoito {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data;
		List<Integer> mesComTrintaUmDias = Arrays.asList(1,3,5,7,8,10,12);
		List<Integer> mesComTrintaDias = Arrays.asList(4,6,9,11);
		int dia, mes, ano;
		
		System.out.println("Digite uma data: (DD/MM/AAAA)");
		data = scan.next();
		
		dia = Integer.valueOf(data.substring(0,2)).intValue();
		System.out.println(dia);
		
		mes = Integer.valueOf(data.substring(3,5)).intValue();
		System.out.println(mes);
		
		ano = Integer.valueOf(data.substring(6)).intValue();
		System.out.println(ano);
		
//		if(mes == 2 && dia <= 29 && ano % 4 == 0) {
//			System.out.println("Data válida.");
//		} else if (dia <= 31 && mes <= 12) {
//			System.out.println("Data válida.");
//		} else {
//			System.out.println("Data inválida.");
//		}
		
		if(ano < 0) {
			System.out.println("Ano inválida.");
		} else {
			if (mes < 1 || mes > 12) {
				System.out.println("Mês inválido");
			} else if (mesComTrintaUmDias.contains(mes)) {
				if (dia > 0 && dia < 32) {
					System.out.println("Data válida");
				} else {
					System.out.println("Data inválida.");
				}
			}else if (mesComTrintaDias.contains(mes)) {
				if (dia > 0 && dia < 31) {
					System.out.println("Data válida");
				} else {
					System.out.println("Data inválida.");
				}
			} else {
				if (ano % 4 == 0) {
					if (dia > 0 && dia < 30) {
						System.out.println("Data válida");
					} else {
						System.out.println("Data inválida.");
					}
				} else {
					if (dia > 0 && dia < 29) {
						System.out.println("Data válida");
					} else {
						System.out.println("Data inválida.");
					}
				}
			}
		}

	}

}
