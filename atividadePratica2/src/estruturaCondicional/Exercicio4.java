package estruturaCondicional;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		String c1, c2, c3;
		
		System.out.println("*****Digite 3 características de um animal*****");
		Scanner leia = new Scanner(System.in);
		
		System.out.print("1ª Característica: ");
		c1 = leia.nextLine();
		
		System.out.print("2ª Característica: ");
		c2 = leia.nextLine();
		
		System.out.print("3ª Característica: ");
		c3 = leia.nextLine();
		
		leia.close();
		
		if(c1.equalsIgnoreCase("Vertebrado")) {
			if(c2.equalsIgnoreCase("Ave")) {
				if(c3.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Águia");
				}else if(c3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Pomba");
				}
			}else if(c2.equalsIgnoreCase("Mamífero")) {
				if (c3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Homem");
				}else if(c3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Vaca");
				}
			}
		}
		if (c1.equalsIgnoreCase("Invertebrado")) {
			if(c2.equalsIgnoreCase("Inseto")){
				if(c3.equalsIgnoreCase("Hematófago")){
					System.out.println("Pulga");
				}else if(c3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Lagarta");
			}
			}else if(c2.equalsIgnoreCase("Anelídeo")) {
				if(c3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Sanguesuga");
				}else if(c3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Minhoca");
				}
			}	
		}
	}
}
