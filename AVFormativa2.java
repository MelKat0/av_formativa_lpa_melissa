package lpa_formativa;

import java.util.Scanner;

public class AVFormativa2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double v1, v2, resultado;
		String operacao;
		
		System.out.println("Informe o primeiro valor: ");
		v1 = ler.nextDouble();
		
		System.out.println("Informe o segundo valor: ");
		v2 = ler.nextDouble();
		
		System.out.println("Informe a operação desejada + ou - ou *:");
		operacao = ler.next();
		
		if (operacao.equals("+")) {
			
			resultado = v1+v2;
			System.out.println("O resultado é: " + resultado);
		}
		else if (operacao.equals("-")) {
			
			resultado = v1-v2;
			System.out.println("O resultado é: " + resultado);
		}
		else if (operacao.equals("*")) {
			
			resultado = v1*v2;
			System.out.println("O resultado é: " + resultado);
		}
		else {
			
			System.out.println("A solicitação está incorreta!");
		}
		ler.close();
	}

}
