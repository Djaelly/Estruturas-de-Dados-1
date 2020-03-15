package Questao07;

import java.util.Scanner;

public class Questao07 {

	public static void main(String str[]) {
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.print("Digite um numero: ");
		numero = ler.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

		ler.close();
	}
}
