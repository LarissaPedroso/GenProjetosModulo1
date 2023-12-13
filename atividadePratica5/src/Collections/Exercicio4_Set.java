package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4_Set {
	public static void main(String[] args) {
		int numeroDigitado;
		boolean posicao;
		
		Set<Integer> numeros =  new HashSet<Integer>();
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
		
		System.out.println("Números: " + numeros); //só fiz esse print para testar o que iria acontecer
		
		posicao = numeros.contains(numeroDigitado);
		if(posicao == true) {
			System.out.println("\nO número " + numeroDigitado + " foi encontrado!");
		}else {
			System.out.println("\nO número " + numeroDigitado + " não foi encontrado!");
		}
	}
}
