package Questao04;

import java.util.Locale;
import java.util.Scanner;

public class Questao04 {

	public static void main(String str[]) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);

		final float refri = 3.50f, fatia = 3.00f, taxa = 0.10f;
		float total;
		int r, f, p;

		System.out.print("Quatidade de Refrigerantes :");
		r = ler.nextInt();
		System.out.print("Fatias: ");
		f = ler.nextInt();
		System.out.print("Pessoas: ");
		p = ler.nextInt();

		total = f * fatia + r * refri;
		System.out.println("Total sem a taxa: " + total);

		System.out.println("Total com a taxa: " + (total + total * taxa));
		System.out.println("Rateio com taxa: " + (total + total * taxa) / p);

		ler.close();
	}
}
