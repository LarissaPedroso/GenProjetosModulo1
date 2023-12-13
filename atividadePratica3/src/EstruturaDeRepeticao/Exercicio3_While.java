package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio3_While {
	public static void main(String[] args) {

		int idade = 0, contador1 = 0, contador2 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		/*	Laço de repetição para pedir a idade 
		 	até que ela seja negativa
		*/
		while(idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
			if(idade > 0 && idade < 21) { 
				contador1++; //contador menores de 21 anos
			}else if(idade > 50) { 
				contador2++;//contador maiores de 51 anos
			}
		}
		
		leia.close();
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + contador1);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + contador2);
	}

}
