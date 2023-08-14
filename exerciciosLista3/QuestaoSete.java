package exerciciosLista3;

import java.util.Scanner;

public class QuestaoSete {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int identificacao, identificacaoMaisGordo = 0, identificacaoMaisMagro = 0;
		double peso, maisGordo = 0, maisMagro = 999999999;

		for (int i = 1; i < 11; i++) {
			System.out.println("Digite o identificação do boi: ");
			identificacao = scan.nextInt();
			
			System.out.println("Digite o peso do boi: ");
			peso = scan.nextDouble();
			
			if (peso > maisGordo) {
				identificacaoMaisGordo = identificacao;
				maisGordo = peso;
			}
			
			if (peso < maisMagro) {
				identificacaoMaisMagro = identificacao;
				maisMagro = peso;
			}
		}
		
		System.out.println("A identificação do boi mais gordo: " + identificacaoMaisGordo + " e seu peso: " + maisGordo);
		System.out.println("A identificação do boi mais magro: " + identificacaoMaisMagro + " e seu peso: " + maisMagro);

	}

}
