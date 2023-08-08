package exercicioPratico;

import java.util.Scanner;

public class QuestaoTres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double alturaParede, larguraParede, alturaAzulejo, larguraAzulejo, quantidadeAzulejo;
		
		System.out.println("Digite a altura da parede: ");
		alturaParede = scan.nextDouble();
		
		System.out.println("Digite a largura da parede: ");
		larguraParede = scan.nextDouble();
		
		System.out.println("Digite a altura do azulejo: ");
		alturaAzulejo = scan.nextDouble();
		
		System.out.println("Digite a largura do azulejo: ");
		larguraAzulejo = scan.nextDouble();
		
		quantidadeAzulejo = (alturaParede * larguraParede) / (alturaAzulejo * larguraAzulejo);
		
		System.out.printf("Quantidade de azulejos necessários para cobrir a parede: %.2f", quantidadeAzulejo);

	}

}
