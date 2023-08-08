package exerciciosLista2;

import java.util.Scanner;

public class QuestaoVinteCinco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int contador = 0;
		String[] resposta = new String[5];
		
		System.out.println("Telefonou para a vítima? (Sim ou Não)");
		resposta[0] = scan.next();
		
		System.out.println("Esteve no local do crime? (Sim ou Não)");
		resposta[1] = scan.next();
		
		System.out.println("Mora perto da vítima? (Sim ou Não)");
		resposta[2] = scan.next();
		
		System.out.println("Devia para a vítima? (Sim ou Não)");
		resposta[3] = scan.next();
		
		System.out.println("Já trabalhou com a vítima? (Sim ou Não)");
		resposta[4] = scan.next();
		
		for(String i : resposta) {
			if(i.toLowerCase().equals("sim")) {
				contador++;
			}
		}
		
		if (contador < 2) {
			System.out.println("Inocente");
		} else if (contador == 2) {
			System.out.println("Suspeita");
		} else if(contador < 5) {
			System.out.println("Cúmplice");
		} else {
			System.out.println("Assassino");
		}

	}

}
