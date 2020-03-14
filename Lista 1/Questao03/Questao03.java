package Questao03;

import java.util.Locale;
import java.util.Scanner;

public class Questao03 {
	public static void main(String arg[]) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
		// add, sub, mult, quociente, resto, potencia
		int n1, n2;

		System.out.print("Digite o primeiro numero: ");
		n1 = ler.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = ler.nextInt();

		System.out.println("Soma: " + (n1 + n2));
		System.out.println("Subtração: " + (n1 - n2));
		System.out.println("Multiplicação: " + (n1 * n2));
		System.out.println("Quociente: " + (n1 / n2));
		System.out.println("Resto: " + (n1 % n2));
		System.out.println("Potencia: " + Math.pow(n1, n2));
		ler.close();
	}
}
