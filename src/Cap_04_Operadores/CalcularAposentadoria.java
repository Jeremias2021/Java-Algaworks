package Cap_04_Operadores;

import java.util.Scanner;
public class CalcularAposentadoria {

	public static void main(String[] args) {
		Boolean podeAposentar = true;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a sua Idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Quanatas vezes que vo�e Contribuiu: ");
		Integer contribuicao = scanner.nextInt();
		
		podeAposentar = idade >= 55 && contribuicao >= 25;
		
		if(podeAposentar) {
			System.out.println(" Parab�ns, pode Aposentar");
		} else {
			System.out.println("Infelizmente n�o pode Aposentar");
		}
		
	
     scanner.close();
	}

}
