package matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o número de linhas da matriz: ");
		int linha = sc.nextInt();

		System.out.println("Entre com o número de colunas da matriz: ");
		int coluna = sc.nextInt();

		int[][] matriz = new int[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Entre com o valor para a linha " + i + "coluna: " + j);
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite o número que quer buscar na matriz:");
		int buscar = sc.nextInt();
		buscaMatriz(buscar, matriz);
		sc.close();
	}

	public static void buscaMatriz(int buscar, int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == buscar) {
					System.out.println("Ocorrência encontrada em " + i + "," + j);
					// para imprimir as ocorrências acima, abaixo, esquerda e direita:
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + matriz[i - 1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Direita: " + matriz[i][j + 1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Abaixo: " + matriz[i + 1][j]);
					}
				}
			}
		}
	}
}