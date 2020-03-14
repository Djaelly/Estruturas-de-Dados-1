package Questão02;

import java.util.Locale;
import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);

		int idade;
		float altura;
		char letra;
		String nome;

		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		System.out.print("Digite sua altura: ");
		altura = ler.nextFloat();
		System.out.print("Digite a primeira letra do seu nome: ");
		letra = ler.next().charAt(0);
		System.out.print("Digite seu nome completo: ");
		ler.nextLine();
		nome = ler.nextLine();

		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Letra: " + letra);
		System.out.println("Nome: " + nome);
		ler.close();
	}
}
