package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2_Pilha {
	public static void main(String[] args) {
		int opcao;
		String nomeLivro;
		String resetar = "\u001B[0m", amarelo = "\u001B[33m", fundoPreto = "\u001B[40m";
		
		Stack<String> pilhaLivros = new Stack<String>();
		
		System.out.println("*****************************\n");
		System.out.println(amarelo+"1 - Adicionar Livro na Pilha \n2 - Listar todos os Livros \n3 - Retirar Livro da Pilha \n0 - Sair"+resetar);
		System.out.println("\n*****************************");
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("\nDigite a opção: ");
			opcao = leia.nextInt();
			leia.nextLine();
			
			if(opcao == 1) {
				System.out.print("\nDigite o nome: ");
				nomeLivro = leia.nextLine();
				pilhaLivros.push(nomeLivro);
				System.out.println("\nPilha: ");
				for(String nome : pilhaLivros) {
					System.out.println(amarelo + nome + resetar);
				}
				System.out.println(fundoPreto + "\nLivro adicionado!" + resetar);
			}else if(opcao == 2) {
				System.out.println("\nLista de Livros da Pilha: ");
				for(String nome : pilhaLivros) {
					System.out.println(amarelo + nome + resetar);
				}
			}else if(opcao == 3) {
				if(pilhaLivros.isEmpty() == true) {
					System.out.println("\nA pilha está vazia!");
				}else {
					pilhaLivros.pop();
					System.out.println("\nPilha: ");
					for(String nome : pilhaLivros) {
						System.out.println(amarelo + nome + resetar);
					}
					System.out.println(fundoPreto + "\nUm livro foi retirado da pilha!" + resetar);
				}
			}
		}while(opcao != 0);
		System.out.println("Programa Finalizado!");
		leia.close();
	}
}
