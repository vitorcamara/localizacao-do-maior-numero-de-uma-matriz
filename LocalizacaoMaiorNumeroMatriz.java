package com.vitorcamara.projetos;

import java.util.Random;

public class LocalizacaoMaiorNumeroMatriz {

	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[4][4]; // criando uma matriz 4x4

		Random numeroRandom = new Random(); // criando objeto da classe Random para gerar números aleatórios

		for (int i = 0; i < numerosAleatorios.length; i++) {

			for (int j = 0; j < numerosAleatorios[i].length; j++) {

				numerosAleatorios[i][j] = numeroRandom.nextInt(100); // delimitando valores para os números randômicos
																		// até 100
			}
		}

		int maior = 0;
		int linha = 0;
		int col = 0;

		for (int i = 0; i < numerosAleatorios.length; i++) {

			for (int j = 0; j < numerosAleatorios[i].length; j++) {

				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j]; // coletando o maior número aleatório gerado
					linha = i;
					col = j;
				}
			}

		}

		for (int i = 0; i < numerosAleatorios.length; i++) {

			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nMaior valor = " + maior);
		System.out.println("Linha = " + linha); // mostrando a linha da posição do maior número da matriz
		System.out.println("Coluna = " + col); // mostrando a coluna da posição do maior número da matriz
	}

}
