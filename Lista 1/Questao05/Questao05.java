package Questao05;

import java.util.Locale;
import java.util.Scanner;

public class Questao05 {

	public static void main(String str[]) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);

		float altura, peso;

		System.out.print("Digite sua altura: ");
		altura = ler.nextFloat();
		System.out.print("Digite seu peso: ");
		peso = ler.nextFloat();

		if (altura * altura != 0) {
			System.out.printf("IMC = " + "%.2f", peso / (altura * altura));
		} else {
			System.out.println("Erro divisor não pode ser zero");
		}
		ler.close();
	}
}
