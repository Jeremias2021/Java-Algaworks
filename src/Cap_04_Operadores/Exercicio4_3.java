package Cap_04_Operadores;
import java.util.Scanner;

public class Exercicio4_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro Valor: ");
		Integer Valor1 = scanner.nextInt();
		
		System.out.print("Informe o segundo Valor: ");
		Integer Valor2 = scanner.nextInt();
		
		System.out.print("Informe a Operação a ser Realizado: ");
	    int Operacao = scanner.nextInt();
		
	   
		Integer Operacao1 = Valor1 + Valor2;   //adicao
		Integer Operacao2 = Valor1 - Valor2;   //subtracao 
		Integer Operacao3 = Valor1 * Valor2;   // multiplicacao 
		Integer Operacao4 = Valor1 / Valor2;   //divisao 
		
		if(Operacao == 1) {
			   System.out.println("Resultado da Operação é: " + Operacao1);
			} else if (Operacao == 2) {
				System.out.println("Resultado da Operação é: " + Operacao2);	
			} else if (Operacao == 3) {
                System.out.println("Resultado da Operação é: " + Operacao3);
			} else if (Operacao == 4) {
				System.out.println("Resultado da Operação é: " + Operacao4);
			}
              
		scanner.close();
	}

}
