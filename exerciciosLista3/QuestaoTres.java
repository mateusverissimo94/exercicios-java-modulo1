package exerciciosLista3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestaoTres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		int numerosImpar = 0, maiorNumeroPar = 0, maiorNumero = 0, menorNumero = 999999999;

		for(int i = 0; i < 20;i++) {
			System.out.printf("Digite o número %d:%n", i+1);
			numeros.add(scan.nextInt());
		}
		
		for(int i : numeros) {
			if(i % 2 == 0 && i > maiorNumeroPar) {
				maiorNumeroPar = i;
			} else if (i % 2 != 0){
				numerosImpar += i;
			}
			
			if(i > maiorNumero) {
				maiorNumero = i;
			} 
			
			if (i < menorNumero) {
				menorNumero = i;
			}
		}
		
		System.out.println("A média dos números impares é " + (numerosImpar / 20));
		System.out.println("O maior número par é " + maiorNumeroPar);
		System.out.println("A diferença entre o maior número da lista e o menor é " + (maiorNumero - menorNumero));
	}

}
