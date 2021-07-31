package Cap_02_e_03_VariaveisEConstantes;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
		
		System.out.println(" CÁLCULO DO ÍNDICE DE MASSA CORPORAL " );
		
		System.out.println(" Digite seu peso (em Kg): " );
		double peso = scanner . nextDouble ();
		
		System.out.println( " Digite sua altura (em metros): " );
	    double altura = scanner . nextDouble ();
		
	    double alturaAoQuadrado = altura * altura;
		
		Double indiceMassaCorporal = peso / alturaAoQuadrado;
		
		System.out.println( " Seu IMC é: "  + indiceMassaCorporal);
		
		scanner.close();
		
	}

}
