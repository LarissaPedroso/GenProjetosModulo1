package estruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int numero;
		float resto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		leia.close();
		
		resto = numero % 2;
		if (resto == 0 && numero > 0) {
			System.out.println("O número " + numero + " é par e positivo!");
		}else if (resto == 0 && numero < 0) {
			System.out.println("O número " + numero + " é par e negativo!");
		}else if (resto != 0 && numero > 0) {
			System.out.println("O número " + numero + " é ímpar e positivo!");
		}else if (resto != 0 && numero < 0) {
			System.out.println("O número " + numero + " é ímpar e negativo!");
		}
	}
}
