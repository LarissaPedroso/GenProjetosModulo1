package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio4_While {
	public static void main(String[] args) {
		int idade, genero, dev, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
		String continuar = "S";
		double contTotal = 0, sumIdade = 0, media = 0;
		
		System.out.println("****Menu Colaboradores****");
		System.out.println("\n*Identidade de Gênero*");
		System.out.println("1 - Mulher Cis \n2 - Homem Cis \n3 - Não Binário \n4 - Mulher Trans \n5 - Homem Trans \n6 - Outros");
		
		System.out.println("\n*Pessoa Desenvolvedora*");
		System.out.println("1 - Backend \n2 - Frontend \n3 - Mobile \n4 - FullStack");
		
		Scanner leia = new Scanner(System.in);
		
		while(continuar.equalsIgnoreCase("S"))
		{
			System.out.print("\nIdade: ");
			idade = leia.nextInt();
			System.out.print("Identidade de Gênero: ");
			genero = leia.nextInt();
			System.out.print("Pessoa Desenvolvedora: ");
			dev = leia.nextInt();
			System.out.print("\nDeseja Continuar (S/N): ");
			continuar = leia.next();
			
			contTotal++; //contador do total de pessoas
			sumIdade+=idade;
			media = sumIdade/contTotal; // media da idade das pessoas que responderam
			
			if(dev == 1) {
				cont1++;
			}else if((genero == 1 || genero == 4) && dev == 2) {
				cont2++;
			}else if((genero == 2 || genero == 5) && dev == 3 && idade > 40) {
				cont3++;
			}else if(genero == 3 && dev == 4 && idade < 30) {
				cont4++;
			}
			if(continuar.equalsIgnoreCase("N")) {
				System.out.println("");
				System.out.println("Total de pessoas desenvolvedoras Backend: " + cont1);
				System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + cont2);
				System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + cont3);
				System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + cont4);
				System.out.printf("O número total de pessoas que responderam à pesquisa: %.0f", contTotal);
				System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f", media);
			}
		}
		leia.close();
	}
}
