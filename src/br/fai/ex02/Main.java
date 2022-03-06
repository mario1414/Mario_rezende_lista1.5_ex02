package br.fai.ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
		realizar();
	}

	private void realizar() {
		int i = 0;
		int teste = 0;
		Scanner leitura = new Scanner(System.in);

		int[] valor = new int[10];

		while (i < 10) {
			System.out.print("Digite o Valor " + (i + 1) + ": ");
			valor[i] = leitura.nextInt();
			teste = valor[i];
			if (teste <= -1) {
				i = 9;
			}
			i = i + 1;
		}
		calculo(valor);
	}

	private void calculo(int valor[]) {
		int soma = 0;
		float media = 0;
		int j = 0;

		for (int i = 0; i < valor.length; i++) {
			soma = soma + valor[i];
			j = i;
		}
		media = soma / j;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}

}
