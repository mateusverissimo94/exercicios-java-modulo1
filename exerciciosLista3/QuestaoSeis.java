package exerciciosLista3;

public class QuestaoSeis {

	public static void main(String[] args) {
		int somaPartes = 0;
		
		for (int i = 100; i <= 200;i++) {
			if (i % 2 == 0) {
				somaPartes += i;
			}
		}
		
		System.out.println("Soma de todos os números de 100 até 200: " + somaPartes);
	}

}
