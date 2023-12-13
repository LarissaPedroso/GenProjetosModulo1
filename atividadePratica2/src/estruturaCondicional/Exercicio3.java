package estruturaCondicional;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeiraDoacao = true;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o Nome do doador: ");
		nome = leia.nextLine();
		
		System.out.print("Digite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.print("Primeira doação de sangue? ");
		primeiraDoacao = leia.nextBoolean();
		
		leia.close();
		
		if(idade >= 18 && idade < 60) {
			System.out.println(nome + " está apte para doar sangue!");
		}else if(idade >= 60 && idade <= 69 && primeiraDoacao == false) {
			System.out.println(nome + " está apte para doar sangue!");
		}else
		{
			System.out.println(nome + " não está apte para doar sangue!");
		}
	}
}
