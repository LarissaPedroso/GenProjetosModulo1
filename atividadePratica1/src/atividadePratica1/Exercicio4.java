package atividadePratica1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		float n1, n2, n3, n4, calculo;

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		n1 = leia.nextFloat();
		
		System.out.print("Numero 2: ");
		n2 = leia.nextFloat();
		
		System.out.print("Numero 3: ");
		n3 = leia.nextFloat();
		
		System.out.print("Numero 4: ");
		n4 = leia.nextFloat();
		
		leia.close();
		
		calculo = (n1*n2) - (n3*n4);
		System.out.printf("Resultado: %.2f", calculo);
	}
}
