package lpa_formativa;

import java.util.Scanner;

public class AVFormativa1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double l, a;
		
		System.out.println("Informe a medida do lado do quadrado:");
		l = ler.nextDouble();
		
		a = l*l;
		
		
		System.out.println("A área do quadrado é: " + a);
		
		ler.close();

	}

}
