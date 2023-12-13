package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3_Set {
public static void main(String[] args) {
		
		int numeros;
		Set<Integer> setInteiro = new HashSet<Integer>();
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			numeros = leia.nextInt();
			setInteiro.add(numeros);
		}
		leia.close();
		
		System.out.println("\nListar dados do Set: ");
		Iterator<Integer> isetInteiro = setInteiro.iterator();
		while(isetInteiro.hasNext()) {
			System.out.println(isetInteiro.next());
		}
	}
}
