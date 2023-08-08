package exerciciosLista1;

import java.util.Scanner;

public class Aprovado {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nomeAluno;
		double nota1, nota2, media;
		String resposta;

		System.out.println("Digite o nome do aluno: ");
		nomeAluno = scan.nextLine();

		System.out.printf("Digite a primeira nota do aluno %s: %n", nomeAluno);
		nota1 = scan.nextDouble();

		System.out.printf("Digite a segunda nota do aluno %s: %n", nomeAluno);
		nota2 = scan.nextDouble();

		media = (nota1 + nota2) / 2;

		if (media >= 7 && media <= 10) {
			System.out.printf("Aluno %s APROVADO, média: %.1f", nomeAluno, media);
		} else if (media >= 3 && media <= 6.9) {
			System.out.printf("Aluno %s em RECUPERAÇÃO, média: %.1f", nomeAluno, media);
		} else {
			System.out.printf("Aluno %s REPROVADO, média: %.1f", nomeAluno, media);
		}
		
		resposta = (media >= 7) ? "APROVADO" : (media >= 3 && media <= 6.9) ? "RECUPERAÇÃO" : "REPROVADO";
	}
}
