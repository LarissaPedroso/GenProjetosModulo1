package vetorMatriz;

import java.util.Scanner;

public class Exercicio3_matriz {
	public static void main(String[] args) {
		int somaP = 0;
		int somaS = 0;
		int matrizP;
		int matrizS;
		int matriz[][] = new int[3][3];

		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("Digite um valor para a posição [" + i + "][" + j + "]: ");
				matriz[i][j] = leia.nextInt();
			}
		}

		leia.close();

		System.out.println("Elementos da Diagonal Principal: ");
		for(int i = 0; i < 3; i++){
			for(int j =0; j < 3; j++) {
				if(i==j) {
					matrizP = matriz[i][j];
					System.out.print(matrizP);
					somaP+=matriz[i][j];
				}
			}
		}
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		for(int i = 0; i < 3; i++){
			for(int j =0; j < 3; j++) {
				if(i+j == 2) {
					matrizS =  matriz[i][j];
					System.out.print(matrizS);
					somaS+=matriz[i][j];
				}
			}
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: \n" + somaP);
		System.out.println("Soma dos Elementos da Diagonal Secundária: \n" + somaS);
	}
}
