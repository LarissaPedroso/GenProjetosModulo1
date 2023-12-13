package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio5_DoWhile {
	public static void main(String[] args) {
		int num, sum = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			if(num > 0) {
				sum+=num;
			}
		}while(num != 0);
		System.out.println("\nA soma dos números positivos é: " + sum);
		leia.close();
	}
}
