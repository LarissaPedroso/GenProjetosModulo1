package estruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
		
		int valorA, valorB, valorC, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		valorA = leia.nextInt();
		
		System.out.print("Digite o número B: ");
		valorB = leia.nextInt();
		
		System.out.print("Digite o número C: ");
		valorC = leia.nextInt();
		
		leia.close();
		
		soma = valorA + valorB;
		
		if(soma > valorC) {
			System.out.println("A soma de A + B é maior do que C.");
		}else if (soma < valorC) {
			System.out.println("A soma de A + B é menor do que C.");
		}else {
			System.out.println("A soma de A + B é igual a C.");
		}
	}
}
