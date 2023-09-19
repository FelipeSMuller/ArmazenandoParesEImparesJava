package Exercicios;

public class Exercicio13 {

	public static void main(String[] args) {

		/*
		 * Faça uma classe contendo dois arrays do tipo inteiro, um chamado par e outro
		 * chamado ímpar. Cada array deve conter 10 elementos. A seguir, faça um laço de
		 * repetição com 10 iterações e que contenha internamente a geração randômica de
		 * números entre 1 e 20. Se o valor gerado for par, armazene no array chamado
		 * par, caso contrário, no array chamado impar. Ao final, apresente o conteúdo
		 * de cada um dos arrays.
		 */

		int[] numerosPares = new int[10];
		int[] numerosImpares = new int[10];

		for (int i = 0; i < numerosPares.length; i++) {
			int recebe;

			do {
				recebe = (int) (Math.random() * 21);
			} while (recebe % 2 != 0);

			numerosPares[i] = recebe;
		}

		System.out.println("Numeros Pares");

		for (int i = 0; i < numerosPares.length; i++) {
			System.out.print(numerosPares[i] + " ");
		}

		System.out.println();

		System.out.println("Numeros Impares");

		for (int i = 0; i < numerosImpares.length; i++) {
			int recebe;

			do {
				recebe = (int) (Math.random() * 21); // Gera números entre 0 e 20 (inclusive)
			} while (recebe % 2 == 0 || recebe == 0);

			numerosImpares[i] = recebe;

			System.out.print(numerosImpares[i] + " ");
		}

	}

}
