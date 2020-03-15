package Questao10;

import java.util.Scanner;

public class Questao10 {

	public static void main(String str[]) {
		
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.print("Digite um numero de 1 a 5: ");
		numero = ler.nextInt();

		switch (numero) {

		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Quatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		default:
			System.out.println("Valor invalido!");
			break;
		}

		ler.close();
	}
}
