package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio6_DoWhile {
	public static void main(String[] args) {
		int num,  resto = 0;
		double sum = 0, total = 0, media = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do{
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			resto = num % 3;
			
			if(resto == 0) {
				sum+=num;
				if(num > 0) {
					total++;
				}
			}
		}while(num != 0);
		
		media = sum/total;
		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f",  media);
		leia.close();
	}
}
