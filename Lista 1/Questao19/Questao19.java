package Questao19;

import java.util.Scanner;

//import javax.swing.JOptionPane;
//import javax.swing.plaf.synth.SynthSeparatorUI;

public class Questao19 {

	public static void main(String str[]) {

		Scanner ler = new Scanner(System.in);
		// int n = Integer.parseInt(JOptionPane.showInputDialog("n: "));

		System.out.print("Numero de elementos: ");
		int n = ler.nextInt();
		int[] vetor = new int[n];

		System.out.println("Lendo...");

		for (int i = 0; i < n; i++) {
			vetor[i] = ler.nextInt();
		}

		System.out.println("Exibindo...");

		for (int i = 0; i < n; i++) {
			System.out.println(vetor[i]);
		}
		ler.close();
	}
}
