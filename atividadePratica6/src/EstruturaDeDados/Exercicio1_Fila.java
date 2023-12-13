package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1_Fila {
	public static void main(String[] args) {
		int opcao;
		String nome;
		
		Queue<String> fila = new LinkedList<String>();
		
		System.out.println("*************************\n");
		System.out.println("1 - Adicionar Cliente na Fila \n2 - Listar todos os Clientes \n3 - Retirar Cliente da Fila \n0 - Sair");
		System.out.println("\n*************************");
		
		Scanner leia = new Scanner(System.in);
		
		do{
			System.out.print("\nDigite uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();

			if(opcao == 1) {
				System.out.print("\nDigite o nome: ");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nFila: ");
				for(String nomes : fila) {
					System.out.println(nomes);
				}
				System.out.println("\nCliente Adicionado!");
			}else if(opcao == 2) {
				System.out.println("\nLista de Clientes na Fila: ");
				for(String nomes : fila) {
					System.out.println(nomes);
				}
			}else if(opcao == 3) {
				if(fila.isEmpty() == true) {
					System.out.println("\nA fila está vazia!");
				}else {
					fila.remove();
					System.out.println("\nFila:");
					for(String nomes : fila) {
						System.out.println(nomes);
					}
					System.out.println("\nO cliente foi Chamado!");
				}
			} 
		}while(opcao != 0);
		System.out.println("Programa Finalizado!");
		leia.close();
	}
}
