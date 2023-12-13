package estruturaCondicional;

import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
		
		String resetar = "\u001B[0m", amarelo = "\u001B[33m", verde = "\u001B[32m";

		int cod, qtd;
		
		String cod1 = "Cachorro Quente", cod2 = "X-Salad", cod3 = "X-Bacon", cod4 = "Bauru", 
		cod5 = "Refrigerante", cod6 = "Suco de Laranja";
		
		float valorCod1 = 10, valorCod2 = 15, valorCod3 = 18, valorCod4 = 12, 
		valorCod5 = 8, valorCod6 = 13, total;
		
		System.out.println("***** Menu da lanchonete *****");
		System.out.println(amarelo + "Cod   Produto          Preço" + resetar);
		System.out.println("01    Cachorro Quente  R$10.00");
		System.out.println("02    X-Salad          R$15.00");
		System.out.println("03    X-Bacon          R$18.00");
		System.out.println("04    Bauru            R$12.00");
		System.out.println("05    Refrigerante     R$ 8.00");
		System.out.println("06    Suco de laranja  R$13.00");
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nCódigo do Produto: ");
		cod = leia.nextInt();
		
		System.out.print("Quantidade: ");
		qtd = leia.nextInt();
		
		leia.close();
		
		System.out.println("\n******************************");
		switch(cod) {
		case 1: 
			total = qtd * valorCod1;
			System.out.println("Produto: " + cod1);
			System.out.println(verde + "Valor total: R$" + total + resetar);
		break;
		case 2:
			total = qtd * valorCod2;
			System.out.println("Produto: " + cod2);
			System.out.println(verde + "Valor total: R$" + total + resetar);
		break;
		case 3:
			total = qtd * valorCod3;
			System.out.println("Produto: " + cod3);
			System.out.println(verde + "Valor total: R$" + total + resetar);
		break;
		case 4: 
			total = qtd * valorCod4;
			System.out.println("Produto: " + cod4);
			System.out.println(verde + "Valor total: R$" + total + resetar);
		break;
		case 5: 
			total = qtd * valorCod5;
			System.out.println("Produto: " + cod5);
			System.out.println(verde + "Valor total: R$" + total + resetar);
		break;
		case 6: 
			total = qtd * valorCod6;
			System.out.println("Produto: " + cod6);
			System.out.println(verde + "Valor total: R$" + total + resetar);
		break;
		}
	}
}
