package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2_ArrayList {
	public static void main(String[] args) {
		int numeroDigitado;
		int posicao;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o número que você deseja encontrar: ");
		numeroDigitado = leia.nextInt();
		
		leia.close();
		
		posicao = numeros.indexOf(numeroDigitado);
		if(posicao > 0) {
			System.out.println("\nO número " + numeroDigitado + " está localizado na posição: " + posicao);
		}else {
			System.out.println("\nO número " + numeroDigitado + " não foi encontrado!");
		}
	}
}
