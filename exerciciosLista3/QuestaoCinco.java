package exerciciosLista3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestaoCinco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sexo, corDosOlhos;
		int contadorHabitantes = 0, idadeEmAnos, contadorFeminino18a35ComOlhosVerdes = 0, maisVelho = 0;
		double porcetagem;
		boolean sexoF, idade18a35, olhosVerdes;
		
		while(true) {
			System.out.printf("Digite o sexo do habitante %d: (M - masculino, F - feminino)%n", contadorHabitantes + 1);
			sexo = scan.next();
			
			System.out.printf("Digite a cor do olho do habitante %d: (A - azul, V - verde, C - castanho)%n", contadorHabitantes + 1);
			corDosOlhos = scan.next();
			
			System.out.printf("Digite a idade em anos do habitante %d: (-1 paar sair)%n", contadorHabitantes + 1);
			idadeEmAnos = scan.nextInt();
			
			if (idadeEmAnos == -1) {
				break;
			}
			
			contadorHabitantes++;
			
			if (idadeEmAnos > maisVelho) {
				maisVelho = idadeEmAnos;
			}
			
			sexoF = sexo.toUpperCase().equals("F");
			idade18a35 = idadeEmAnos >= 18 && idadeEmAnos <= 35;
			olhosVerdes = corDosOlhos.toUpperCase().equals("V");
			
			if (sexoF && idade18a35 && olhosVerdes){
				contadorFeminino18a35ComOlhosVerdes++;
			}
		}
		
		porcetagem = (double) contadorFeminino18a35ComOlhosVerdes / contadorHabitantes * 100;
		
		System.out.println("A maior idade dos habitantes: " + maisVelho);
		System.out.println("Porcentagem de mulheres com olhos verdes entre 18 e 35 anos: " + porcetagem + "%");
	}

}
