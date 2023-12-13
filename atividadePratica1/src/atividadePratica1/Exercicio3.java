package atividadePratica1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		double salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
	
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Salário Bruto: ");
		salarioBruto = leia.nextDouble();
		
		System.out.print("Adicional Noturno: ");
		adicionalNoturno = leia.nextDouble();
		
		System.out.print("Horas Extras: ");
		horasExtras = leia.nextDouble();
		
		System.out.print("Descontos: ");
		descontos = leia.nextDouble();
		
		leia.close();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras*5) - descontos);
		System.out.printf("Salário Liquido: %.2f", salarioLiquido);
		
		leia.close();
	}
}
