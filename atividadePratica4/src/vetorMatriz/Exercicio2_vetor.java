package vetorMatriz;

import java.util.Scanner;

public class Exercicio2_vetor {
	public static void main(String[] args) {
		int vetores[] = new int [10];
		int restoImpar;
		int restoPar;
		int soma = 0;
		double media = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite 10 números para armazenar em um vetor: ");
			vetores[i] = leia.nextInt();
		}
		leia.close();
		
		//Elementos nos índices pares:
		System.out.print("\nElementos nos índices ímpares: ");
		for(int i = 0; i < 10; i++) {
			restoImpar = i % 2;

			if(restoImpar != 0) {
				System.out.print(vetores[i]);
			}
		}
		
		//Elementos Pares:
		System.out.print("\nElementos pares: ");
		for(int i = 0; i < 10; i++) {
			restoPar = vetores[i] % 2;
			if(restoPar == 0) {
				System.out.print(vetores[i]);
			}
		}
		
		//soma & média
		for(int i = 0; i < 10; i++) {
			soma+=vetores[i];
			media = (double)soma/vetores.length;
		}
		System.out.println("\nSoma: " + soma);
		System.out.printf("Média: %.2f",  media);	
	}
}
