package estruturaCondicional;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		String resetar = "\u001B[0m", vermelho = "\u001B[36m", amarelo = "\u001B[33m";
		
		String nome;
		int cod;
		double salario;
		double novoSalario;
		double aumento;
		
		String gerente = "Gerente", vendedor = "Vendedor", supervisor = "Supervisor",
		motorista = "motorista", estoquista = "estoquista", tecnicoTi = "Técnico de TI";
		
		System.out.println("***********************");
		System.out.println(vermelho + "Cod  Cargo         aumento" + resetar);
		System.out.println("1    Gerente       10%");
		System.out.println("2    Vendedor      7%");
		System.out.println("3    Supervisor    9%");
		System.out.println("4    Motorista     6%");
		System.out.println("5    Estoquista    5%");
		System.out.println("6    Técnico de TI 8%");
		
		Scanner leia = new Scanner(System.in);
		System.out.print("\nNome do Colaborador: ");
		nome = leia.nextLine();
		System.out.print("Cargo: ");
		cod = leia.nextInt();
		System.out.print("Salário: ");
		salario = leia.nextFloat();
		leia.close();
		
		System.out.println("\n**********************************");
		System.out.println("Nome do colaborador: " + nome);
		switch(cod) {
		case 1:
			aumento = 1.1;
			novoSalario = salario * aumento;
			System.out.println("Cargo: " + gerente);
			System.out.println(amarelo + "Salário: R$ " + novoSalario + resetar);
		break;
		case 2:
			aumento = 1.07;
			novoSalario = salario * aumento;
			System.out.println("Cargo: " + vendedor);
			System.out.println(amarelo + "Salário: R$ " + novoSalario + resetar);
		break;
		case 3:
			aumento = 1.09;
			novoSalario = salario * aumento;
			System.out.println("Cargo: " + supervisor);
			System.out.println(amarelo + "Salário: R$ " + novoSalario + resetar);
		break;
		case 4:
			aumento = 1.06;
			novoSalario = salario * aumento;
			System.out.println("Cargo: " + motorista);
			System.out.println(amarelo + "Salário: R$ " + novoSalario + resetar);
		break;
		case 5:
			aumento = 1.05;
			novoSalario = salario * aumento;
			System.out.println("Cargo: " + estoquista);
			System.out.println(amarelo + "Salário: R$ " + novoSalario + resetar);
		break;
		case 6:
			aumento = 1.08;
			novoSalario = salario * aumento;
			System.out.println("Cargo: " + tecnicoTi);
			System.out.println(amarelo + "Salário: R$ " + novoSalario + resetar);
		break;
		}
	}

}
