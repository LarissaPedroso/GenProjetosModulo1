package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1_ArrayList {
	public static void main(String[] args) {
		String cores;
		ArrayList<String> coresArrayList = new ArrayList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite a " + (i+1) + "ª cor: ");
			cores = leia.nextLine();
			coresArrayList.add(cores);
		}
		
		leia.close();
		
		System.out.println("\nListar todas as cores: ");
		for(String coresListadas : coresArrayList) {
			System.out.println(coresListadas);
		}
		
		coresArrayList.sort(null);
		System.out.println("\nOrdenar as cores: ");
		for(String coresOrdenadas : coresArrayList) {
			System.out.println(coresOrdenadas);
		}
	}
}
