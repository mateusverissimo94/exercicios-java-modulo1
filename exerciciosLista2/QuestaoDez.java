package exerciciosLista2;

import java.util.Scanner;

public class QuestaoDez {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String turno;
		
		System.out.println("Em que turno você estuda: (M - matutino, V - vespertino, N - noturno)");
		turno = scan.next();
		
		if(turno.toUpperCase().equals("M")) {
			System.out.println("Turno Matutino");
		} else if(turno.toUpperCase().equals("V")) {
			System.out.println("Turno Vespertino");
		} else if(turno.toUpperCase().equals("N")) {
			System.out.println("Turno Noturno");
		} else {
			System.out.println("Turno inválido");
		}
	}

}
