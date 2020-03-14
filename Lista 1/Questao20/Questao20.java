package Questao20;

import java.util.Locale;
import java.util.Scanner;

public class Questao20 {

	public static void main(String str[]) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);

		// int n = Integer.parseInt(JOptionPane.showInputDialog("n: "));

		System.out.print("Numero de elementos: ");
		int linha = ler.nextInt();
		System.out.print("Numero de elementos: ");
		int coluna = ler.nextInt();
		int[][] matriz = new int[linha][coluna];

		System.out.println("Lendo...");

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = ler.nextInt();
			}
		}

		System.out.println("Exibindo...");

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.println(matriz[i][j]);
			}
			System.out.println();
		}

		ler.close();
	}
}
