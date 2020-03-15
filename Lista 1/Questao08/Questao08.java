package Questao08;

import java.util.Scanner;

public class Questao08 {

	public static void main(String str[]) {
		Scanner ler = new Scanner(System.in);
		float n1, n2, n3, media;

		System.out.print("Digite a primeira nota: ");
		n1 = ler.nextFloat();
		System.out.print("Digite a segunda nota: ");
		n2 = ler.nextFloat();
		System.out.print("Digite a terceira nota: ");
		n3 = ler.nextFloat();

		media = (n1 + n2 + n3) / 3;

		if (media > 3.5) {
			if (media >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Prova Final");
			}

		} else {
			System.out.println("Reprovado");
		}

		ler.close();
	}
}
