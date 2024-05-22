package lpa_formativa;

import java.util.Scanner;

public class AVFormativa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double celcius, fahren;
		
		System.out.println("Escreva uma temperatura em fahrenheit: ");
		fahren = ler.nextDouble();
		
		celcius = ((fahren-32)*5)/9;
		
		System.out.println("A temperatura convertida em celcius é " + celcius + "C°");
		
		ler.close();
	}

}
