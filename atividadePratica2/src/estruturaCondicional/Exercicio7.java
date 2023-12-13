package estruturaCondicional;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		String resetar = "\u001B[0m", amarelo = "\u001B[33m";
		double n1, n2, calculo;
		int cod;
		
		System.out.println(">>>>Calculadora>>>>");
		System.out.println(amarelo + "Cod  Operação" + resetar);
		System.out.println("1    Soma");
		System.out.println("2    Subtração");
		System.out.println("3    Multiplicação");
		System.out.println("4    Divisão\n");

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		n1 = leia.nextDouble();
		System.out.print("Digite o 2º número: ");
		n2 = leia.nextDouble();
		System.out.print("Operação: ");
		cod = leia.nextInt();
		leia.close();
		System.out.println("");
		
		switch(cod) {
		case 1:
			calculo = n1 + n2;
			System.out.println(amarelo + n1 + " + " + n2 + " = " + calculo + resetar);
		break;
		case 2:
			calculo = n1 - n2;
			System.out.println(amarelo + n1 + " - " + n2 + " = " + calculo + resetar);
		break;
		case 3:
			calculo = n1 * n2;
			System.out.println(amarelo + n1 + " * " + n2 + " = " + calculo + resetar);
		break;
		case 4:
			calculo = n1 / n2;
			System.out.println(amarelo + n1 + " / " + n2 + " = " + calculo + resetar);
		default:
			System.out.println("Opção inválida.");
		}
	}
}
