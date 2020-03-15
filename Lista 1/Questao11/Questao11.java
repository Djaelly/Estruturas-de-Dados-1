package Questao11;

import java.util.Scanner;

public class Questao11 {

	private static int calcularDelta(int a, int b, int c) {
		return ((b * b) - (4 * a * c));
	}

	private static void raiz(int a, int b, int delta) {

		System.out.println("Raiz 1 = " + ((-b + (Math.sqrt(delta))) / (2 * a)));
		System.out.println("Raiz 2 = " + ((-b - (Math.sqrt(delta))) / (2 * a)));
	}

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int a, b, c, delta;

		System.out.print("Digite o A =");
		a = ler.nextInt();
		System.out.print("Digite o B =");
		b = ler.nextInt();
		System.out.print("Digite o C =");
		c = ler.nextInt();

		delta = calcularDelta(a, b, c);
		raiz(a, b, delta);

		ler.close();
	}

}
