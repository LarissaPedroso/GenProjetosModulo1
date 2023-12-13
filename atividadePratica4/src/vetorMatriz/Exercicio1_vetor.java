package vetorMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1_vetor {
	public static void main(String[] args) {
		int numero;
		int posicao;
		
		int vetorInteiros [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		Arrays.sort(vetorInteiros);
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		leia.close();
		
		posicao = Arrays.binarySearch(vetorInteiros, numero);
		
		if(posicao <= 0) {
			System.out.println("O número " + numero + " não foi localizado!");
		}else {
			System.out.println("O número " + numero + " está localizado na posição: " + posicao);
		}
	}
}
