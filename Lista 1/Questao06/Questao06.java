package Questao06;

import java.util.Locale;
import java.util.Scanner;

public class Questao06 {

	private static final float PI = 3.14f;

	public static void main(String str[]) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);

		int raio;

		System.out.print("Digite o valor do raio: ");
		raio = ler.nextInt();

		if (raio != 0) {
			System.out.printf("Area = " + "%.1f", PI * raio * raio);
		} else {
			System.out.println("Erro, Raio não pode ser 0");
		}

		ler.close();
	}
}
