package Cap_04_Operadores;

import java.util.Scanner;

public class DescoontoDeFretes {
	
	public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.println( " Valor do produto: " );
		int valorProduto = scanner.nextInt();
		
		Boolean precisaCobrarFrete = valorProduto < 100 ;
		
    	int valorFinal = valorProduto;
		
		if (precisaCobrarFrete) {
			valorFinal = 15;
		}
		
		System.out.println( " Valor final: "  + valorFinal);
	
		scanner.close();
		
	}
}
