package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio2_For {
public static void main(String[] args) {
		
		int numero, parImpar, contadorPar = 0, contadorImpar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			numero = leia.nextInt();
			parImpar = numero % 2;
			if(parImpar == 0) {
				contadorPar++;
				
			}else if (parImpar != 0){
				contadorImpar++;
			}
		}
		leia.close();
		System.out.println("\nTotal de números pares: " + contadorPar);
		System.out.println("\nTotal de números ímpares: " + contadorImpar);
	}
}
