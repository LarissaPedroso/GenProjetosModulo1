package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio1_For {
	public static void main(String[] args) {
		int n1, n2, multiplo1, multiplo2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		System.out.print("Digite o segundo número do intervalo: ");
		n2 = leia.nextInt();
		
		leia.close();
		
		System.out.println("");
		
		
		//Testando se o n1 >= n2, pois deve ser: n1 < n2
		if(n1 >= n2) {
			System.out.println("Intervalo inválido!");
			System.exit(0);
		}
		
		
		System.out.println("No intervalo entre " + n1 + " e " + n2 + ":\n");
		/*repetição para mostrar os múltiplos de 3 e 5 
		que estão dentro do intervalo digitado*/
		for(int i = n1; i <n2; i++) {
			multiplo1 = i % 3;
			multiplo2 = i % 5;
			if(multiplo1 == 0 && multiplo2 == 0) {
				System.out.println(i + " é múltiplo de 3 e 5");
			}
		}
	}
}
