package Capitulo_05_Estrutura_Decisao;
import java.util.Scanner;
public class Exercicio_Estrutura_If {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);

		System.out.print("Informe a Nota de Portugu�s:  ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Informe a Nota de Matem�tica:  ");
		Double notaMatematica = scanner.nextDouble();
		
		Double notaFinal = notaMatematica + notaPortugues;
		
		if(notaFinal >= 150) {
			System.out.println("O candidaro passou!!!");
			} else {
				System.out.println("O candidato n�o passou");
			}
		
		
		scanner.close();
	}

}
