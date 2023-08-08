package exerciciosLista2;

import java.util.Scanner;

public class QuestaoDezenove {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, centena, dezena, unidade;
		String separedor1 = "", separador2 = "", centenaFinal, dezenaFinal, unidadeFinal;
		
		System.out.println("Informe um número positivo, menor que 1000: ");
		numero = scan.nextInt();
		
		unidade = numero % 10;
		
		numero = (numero - unidade) / 10;
		
		dezena = numero % 10;
		
		numero = (numero - dezena) / 10;
		
		centena = numero;
		
		if (centena > 0 && dezena > 0 && unidade > 0) {
			separedor1 = " , ";
			separador2 = " e ";
		} else if (centena > 0 && dezena > 0) {
			separedor1 = " e ";
			separador2 = "";
		} else if ((centena > 0 && unidade > 0) || (dezena > 0 && unidade > 0)) {
			separedor1 = "";
			separador2 = " e ";
		}
		
		if (centena > 0) {
			if (centena == 1) {
				centenaFinal = "1 centena"; 
			} else {
				centenaFinal = centena + " centenas";
			}
		} else {
			centenaFinal = "";
		}
		
		if (dezena > 0) {
			if (dezena == 1) {
				dezenaFinal = "1 dezena";
			} else {
				dezenaFinal = dezena + " dezenas";
			}
		} else {
			dezenaFinal = "";
		}
		
		if (unidade > 0) {
			if (unidade == 1) {
				unidadeFinal = "1 unidade";
			} else {
				unidadeFinal = unidade + " unidade";
			}
		} else {
			unidadeFinal = "";
		}
		
		System.out.println(centenaFinal + separedor1 + dezenaFinal + separador2 + unidadeFinal);

	}

}
