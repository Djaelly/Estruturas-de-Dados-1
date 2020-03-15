package Questao13;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		// Questao 12 a, b e c
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, aux;
		
		System.out.print("Digite um numero: ");
		numero1 = ler.nextInt();
		System.out.print("Digite outro numero: ");
		numero2 = ler.nextInt();
		aux = numero1;
		
		System.out.println("\na) While: ");
		while (aux <= numero2) {

			if (aux % 2 != 0) {
				System.out.print(aux + " ");
			}
			aux++;
		}
		
		//Reset variable aux
		aux = numero1;
		System.out.println("\n\nb) Do while: ");
		do {
			if (aux % 2 != 0) {
				System.out.print(aux + " ");
			}
			aux++;
		} while (aux <= numero2);

		System.out.println("\n\nc) For: ");
		for (aux = numero1; aux <= numero2; aux++) {

			if (aux % 2 != 0) {
				System.out.print(aux + " ");
			}
		}

		ler.close();
	}

}
